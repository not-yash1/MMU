package Sep26;

import java.util.*;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] ans = maxSlidingWindow(arr, k);
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] maxSlidingWindow(int[] arr, int k) {
        int[] ans = new int[arr.length - k + 1];
        int max = 0;
        for(int i = 0; i < arr.length - k + 1; i++) {
            max = arr[i];
            for(int j = i + 1; j < i + k; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                }
            }
            ans[i] = max;
        }
        return ans;
    }

    // public static int[] maxSlidingWindow2(int[] arr, int k) {
    //     Dequeue<Integer> q = new Array<>();
    //     int[] ans = new int[arr.length - k + 1];
    //     for(int i = 0; i < arr.length; i++) {
    //         if(!q.isEmpty() && q.peek() == i - k) {
    //             q.poll();
    //         }
    //         while(!q.isEmpty() && arr[q.peekLast()] < arr[i]) {
    //             q.pollLast();
    //         }
    //         q.add(i);
    //         if(i >= k - 1) {
    //             ans[i - k + 1] = arr[q.peek()];
    //         }
    //     }
    //     return ans;
    // }
}
