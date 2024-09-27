package Sep24;
import java.util.Stack;

public class TrappingRainWater {
    public static int trapStack(int[] height) {
        int n = height.length;
        int totalWater = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();

                if (stack.isEmpty()) {
                    break;
                }

                int distance = i - stack.peek() - 1; 
                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top];

                totalWater += distance * boundedHeight;
            }

            stack.push(i);
        }

        return totalWater;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Water trapped (Stack): " + trapStack(height));
        // System.out.println("Water trapped (Stack): " + trapBruteForce(height));
    }

    public static int trapBruteForce(int[] height) {
        int n = height.length;
        int totalWater = 0;

        for (int i = 1; i < n - 1; i++) {
            int maxLeft = 0;
            for (int j = 0; j <= i; j++) {
                maxLeft = Math.max(maxLeft, height[j]);
            }

            int maxRight = 0;
            for (int j = i; j < n; j++) {
                maxRight = Math.max(maxRight, height[j]);
            }

            totalWater += Math.min(maxLeft, maxRight) - height[i];
        }

        return totalWater;
    }

    public static int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int[] min = new int[n];
        int totalWater = 0;

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for (int i = 0; i < n; i++) {
            min[i] = Math.min(leftMax[i], rightMax[i]);
            totalWater += min[i] - height[i];
        }



        return totalWater;
    }
}
