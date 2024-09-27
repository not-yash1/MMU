package Sep24;

import java.util.Stack;

public class InsertingElementInStartingInStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack = insert(stack, 4);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static Stack<Integer> insert(Stack<Integer> stack, int data) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
        stack.push(data);
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        return stack;
    }
    
}
