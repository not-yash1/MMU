package Sep24;

import java.util.Stack;

public class InsertInSortedStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(9);
        stack.push(7);
        stack.push(5);
        stack.push(3);
        stack.push(1);
        stack = insert(stack, 6);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static Stack<Integer> insert(Stack<Integer> stack, int data) {
        Stack<Integer> tempStack = new Stack<>();
        if(stack.peek() > data) {
            stack.push(data);
            return stack;
        } else {
            while (!stack.isEmpty() && stack.peek() < data) {
                tempStack.push(stack.pop());
            }
            stack.push(data);
            while (!tempStack.isEmpty()) {
                stack.push(tempStack.pop());
            }
            return stack;
        }
    }
}
