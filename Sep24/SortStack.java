package Sep24;

import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(4);
        stack.push(3);
        stack.push(1);
        stack = sortStack(stack);

        while (!stack.isEmpty()) {
            // System.out.println(stack.peek());
            System.out.println(stack.pop());
        }
    }

    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        
        while(!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        // stack = tempStack;
        return stack;
    }
}
