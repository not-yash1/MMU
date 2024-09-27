package Sep24;

import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(reverseStringUsingStack(s));
    }

    public static String reverseStringUsingStack(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
