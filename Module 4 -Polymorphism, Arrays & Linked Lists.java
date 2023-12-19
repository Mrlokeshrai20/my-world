1. What is polymorphism in object-oriented programming?

a. A mechanism to create multiple instances of an object
b. A technique to hide the implementation details of an object
c. The ability of a function or method to behave differently based on its input
d. A way to encapsulate data and behavior into a single unit


Answer: c



2. What is the index of the first element in an array?

a. 0
b. 1
c. -1
d. Depends on the programming language


Answer: a. 0


3. What is a linked list?

a. A linear data structure with a fixed size
b. A collection of elements with a non-linear structure
c. A data structure that stores elements in contiguous memory locations
d. A data structure that consists of nodes, each containing a reference to the next node

Answer: d



4. What is the time complexity for accessing an element in an array?

a. O(1)
b. O(log n)
c. O(n)
d. O(n^2)

Answer: a



5.Which type of linked list has a loop or cycle in its structure?

a. Doubly linked list
b. Circular linked list
c. Singly linked list
d. Multi-dimensional linked list

Answer: b



6.In Java, which type of polymorphism is achieved through method overloading?

a. Compile-time polymorphism
b. Runtime polymorphism
c. Static polymorphism
d. Dynamic polymorphism

Answer: a



7.Which of the following is an advantage of linked lists over arrays?

a. Constant-time access to any element
b. Contiguous memory allocation
c. Efficient memory usage
d. Fixed size

Answer: c


Question 8: What will be the output of the following Java code?
  class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListQuestion6 {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;

        Node current = node1;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

a) 1 2 3
b) 3 2 1
c) 1 2
d) 3 2


Question 9: What will be the output of the following Java code?
  class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListQuestion5 {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        System.out.println(node1.next.data);
    }
}

a) 1
b) 2
c) null
d) Compilation Error


Question 10: What will be the output of the following Java code?
  public class ArraysQuestion4 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        System.out.println(names.length);
    }
}

a) 1
b) 2
c) 3
d) 4
