package Sep24;

import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        int n = arr.length;
        // nextGreaterElement(arr, n);
        arr = nextGreaterElement(arr);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void nextGreaterElement(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            int j;
            for(j = i+1; j < n; j++) {
                if(arr[i] < arr[j]) {
                    arr[i] = arr[j];
                    break;
                }
            }
            if(j == n) {
                arr[i] = -1;
            }
        }
    }

    public static int[] nextGreaterElement(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return result;
    }
}
