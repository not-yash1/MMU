package Sep27;

import java.util.HashMap;

public class ContinousSubarraySum {

    public static void main(String[] args) {
        int[] arr = {2, 2, 4, 3, 1, 2, 4};
        int k = 10;
        System.out.println(checkSubarraySum(arr, k));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) sum = sum % k;
            if (map.containsKey(sum)) {
                if (i - map.get(sum) > 1) return true;
            } else {
                map.put(sum, i);
            }
        }
        return false;
    }
    
}
