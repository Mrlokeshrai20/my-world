1. Which of the following traversals gives nodes in a sorted order for a BST?
A) Preorder
B) Inorder
C) Postorder
D) Level Order


2.What does the following function do for a given Binary Tree?

void mirror(Node node) {
    if (node == null) return;
    mirror(node.left);
    mirror(node.right);

    Node temp = node.left;
    node.left = node.right;
    node.right = temp;
}
A) Prints all nodes in level order
B) Converts the tree into its mirror image
C) Checks if the tree is balanced
D) Counts the number of nodes

3.Level Order Traversal of Binary Tree
//Problem: Write a function to perform level order traversal on a binary tree.
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) return result;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        int size = queue.size();
        List<Integer> currentLevel = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            TreeNode current = queue.remove();
            currentLevel.add(current.val);
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        result.add(currentLevel);
    }
    return result;
}


4.Validate Binary Search Tree
//Problem: Write a function to check if a binary tree is a valid binary search tree.
 
  public boolean isValidBST(TreeNode root) {
    return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
}

private boolean validate(TreeNode node, long min, long max) {
    if (node == null) return true;
    if (node.val <= min || node.val >= max) return false;
    return validate(node.left, min, node.val) && validate(node.right, node.val, max);

}


5.Find the Lowest Common Ancestor in a BST
//Problem: Write a function to find the lowest common ancestor (LCA) of two given nodes in a BST.
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) return null;
    if (root.val > Math.max(p.val, q.val)) return lowestCommonAncestor(root.left, p, q);
    if (root.val < Math.min(p.val, q.val)) return lowestCommonAncestor(root.right, p, q);
    return root;
}


6.Add All Greater Values to Each Node in a BST
//Problem: Write a function to modify a BST so that every key is changed to the original key plus the sum of all keys greater than the original key.

  public void modifyBST(TreeNode root) {
    int[] sum = new int[1];
    modifyBSTHelper(root, sum);
}

private void modifyBSTHelper(TreeNode node, int[] sum) {
    if (node == null) return;
    modifyBSTHelper(node.right, sum);
    sum[0] = sum[0] + node.val;
    node.val = sum[0];
    modifyBSTHelper(node.left, sum);
}


7.Diameter of a Binary Tree
//Problem: Write a function to find the diameter of a binary tree (length of the longest path between any two nodes in a tree).

  int diameter;
public int diameterOfBinaryTree(TreeNode root) {
    diameter = 0;
    depth(root);
   

8.Construct Binary Tree from Preorder and Inorder Traversal
//Problem: Given preorder and inorder traversal of a tree, construct the binary tree.

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    Map<Integer, Integer> inMap = new HashMap<>();
    for (int i = 0; i < inorder.length; i++) {
        inMap.put(inorder[i], i);
    }
    return buildTree(preorder, 0, preorder.length - 1, 0, inMap);
}

private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int inStart, Map<Integer, Integer> inMap) {
    if (preStart > preEnd) return null;
    TreeNode root = new TreeNode(preorder[preStart]);
    int inRoot = inMap.get(root.val);
    int numsLeft = inRoot - inStart;
    root.left = buildTree(preorder, preStart + 1, preStart + numsLeft, inStart, inMap);
    root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inRoot + 1, inMap);
    return root;
}

