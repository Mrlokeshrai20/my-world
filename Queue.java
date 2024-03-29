import com.sun.jdi.IntegerValue;

import javax.security.auth.callback.CallbackHandler;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        1. making a todo list using queue-----------
        MyQueue <String> todoList = new MyQueue<> ();
        maketodoList (todoList);
        doAllTasks (todoList);

        2. finding maximum element using queue------------------
        Queue <Integer> q = new LinkedList<>();
        q.add(4);
        q.add(5);
        q.add(0);
        q.add(-1);
        q.add(10);
        System.out.println ("The maximum element using queue is "+maxElementUsingQueue(q));

        3. palindromic String-------------------------------------
        palindrome("DAD");
        palindrome("hahahaha");

        4. reversing a queue using stack---------------------------
          
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        System.out.println ("The original queue "+q1);
        System.out.println ("The reversed queue is "+reverseQueue(q1));

        q1.clear(); // to reuse the queue

        5.delete second half--------------------------------
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0) {
            q1.add(sc.nextInt());
        }
        deleteSecondHalf(q1);

        6. palindrome using doubly ended queue--------------
        System.out.println ("The given string is a palindrome: "+palindromeDeque("abccba"));

        7. decimal to binary----------------------------
        decimalToBinary(00);

        8. max subarray elements
        int [] arr = {12, 1, 78, 90, 57, 89, 56 };
        maxSubArray(arr, 7, 3);

    }
    public static void maxSubArray (int [] arr, int n, int g) {
        Deque<Integer> deque = new LinkedList<>();
        if (n == 0) {
            System.out.println("the array is empty");
            return;
        }
        if (n < g) {
            System.out.println("the size of subgroup exceeds the number of elements in the array ");
            return;
        }
        int i = 0;
        for (i = 0; i <= g - 1; i++) {
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        for (; i < n; i++) {
            System.out.print(arr[deque.peek()]+" ");
            while (!deque.isEmpty() && deque.peek() <= i - g) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        System.out.print(arr[deque.peek()] +" ");
    }

       public static void decimalToBinary (int decimalNumber){
            Queue<String> queue = new LinkedList<>();
            queue.add("1");

            while (queue.size() < decimalNumber) {
                String binaryNumber = queue.remove();
                queue.add(binaryNumber + "0");
                queue.add(binaryNumber + "1");
            }

            System.out.println("The binary representation of " + decimalNumber + " is " + queue.peek());
        }

    public static boolean palindromeDeque (String word) {
        char [] chars = word.toCharArray();
        Deque <Character> deque = new LinkedList<>();
        for (char ch: chars) {
            deque.addFirst(ch);
        }
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();
            if (first != last)
                return false;
        }
        return true;
    }

    static void deleteSecondHalf(Queue<Integer> queue) {
        int n = queue.size();
        Queue <Integer> q = new LinkedList<>();
        for (int  i =0;i<n- n/2; i++ ){
            q.add(queue.remove());
        }
        System.out.println ();
        System.out.println ("After deleting second half "+q);
        // Write your code here
    }
    public static Queue<Integer> reverseQueue (Queue<Integer> q) {
        Stack <Integer> s = new Stack<>();
        Queue <Integer> output = new LinkedList<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) { output.add(s.pop()); }
        return output;
    }
    public static void maketodoList (MyQueue <String> todolist) {
        todolist.add("task1");
        todolist.add("task2");
        todolist.add("task3");
        todolist.add("task4"); // enqueue method
    }
    public static void doAllTasks(MyQueue<String> todolist){
        while (todolist.size() != 0) {
            System.out.println (todolist.remove()); // dequeue method
        }

    }
    public static void palindrome (String input) {
        Queue <Character> q = new LinkedList<>();
        for (int i = input.length()-1;i>=0;i--) {
            q.add(input.charAt(i));
        }
        String reversedString ="";
        while (!q.isEmpty()) {
            reversedString += q.remove();
        }
        if (input.equals(reversedString)) {
            System.out.println ("The given input " + input + " is a palindrome.");
        }
        else
            System.out.println ("The given input " + input + " is not a palindrome.");
    }
    public static int maxElementUsingQueue (Queue <Integer> q) {
        int max = q.peek();
        for (int i = 0;i<q.size() ;i++) {
            int element = q.remove();
            if (max<element)
                max = element;
            q.add(element);
        }
        return max;
    }

}
9. Stack using 2 queues----------------------------------------
  
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

public class stackUsingTwoQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push (int data) {
        // making the push operation costly
        q2.add(data);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue <Integer> temp = new LinkedList<>();
        temp = q1;
        q1= q2;
        q2= temp;
    }
    public int pop () {
//        if (q1.isEmpty())
//            throw new NullPointerException("Stack is empty");
//        return q1.remove();
        //--------------making the pop operation costly
        int n = 0;
        while ( n < q1.size()-1) {
            q2.add(q1.remove());
            n++;
        }
        int temp = q1.remove();
        return temp;
    }
}
10.  StackUsingOneQueue---------------------------------
  
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {
    Queue< Integer > q1 = new LinkedList< Integer >();

    /* Push operation of stack using queue*/
    void push(int x) {
        //write your code here
        int size = q1.size();
        int n =0;
        q1.add(x);
        while (n < size) {
            q1.add(q1.remove());
            n++;
        }
    }

    /*Removes the top element of the stack*/

    int pop() {
        return q1.remove();
    }
    int top() {
        return q1.peek();

    }

}
 11. QueueUsingtwoStack------------------------------------------------
   
import java.util.Stack;

public class QueueUsingtwoStack {
    private static Stack <Integer> s1 = new Stack<>();
   private static Stack <Integer> s2 = new Stack<>();

    public static void add (int data) {
        s1.push (data);
    }
    public static int pop (){
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int res = s2.pop();
        while (!s2.isEmpty())
            s1.push (s2.pop());
        return res;
    }
}
