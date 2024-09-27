package Sep26;

import java.util.LinkedList;
import java.util.Queue;
// import java.util.Stack;

class StackUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public void push(int x) {
        q1.add(x);
        while(!q2.isEmpty()) {
            q1.add(q2.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    public int pop() {
        return q1.remove();
    }
    public int top() {
        return q1.peek();
    }
    public boolean empty() {
        return q1.isEmpty();
    }
}

public class ImplementStackUsingQueue {

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
    }
}
