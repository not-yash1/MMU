package Sep24;

import java.util.Stack;

public class LargestRectangleInBinaryMatrix {

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1, 0, 1}, {1, 1, 1, 1, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
        System.out.println(largestRectangleArea(arr));
        // 1 1 1 0 1
        // 1 1 1 1 1
        // 1 0 1 1 1
        // 1 1 1 1 1
        // 1 1 1 1 1
    }

    public static int largestRectangleArea(int[][] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 0) {
                    arr[i][j] = 1;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            max = Math.max(max, largestArea(arr[i]));
        }
        return max;
    }

    public static int largestArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            int height = heights[stack.pop()];
            int width = stack.isEmpty() ? n : n - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }
        return maxArea;
    }
}
