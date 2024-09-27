
package Sep26;
import java.util.*;

class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void push(int x) {
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
    public int pop() {
        return s1.pop();
    }
    public int peek() {
        return s1.peek();
    }
    public int size() {
        return s1.size();
    }
}

public class ImplementingQueueUsingStack {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.peek());
    }
}