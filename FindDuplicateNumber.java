public class FindDuplicateNumber {

    public static int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            int count = 0;
            for (int i=0; i<nums.length; i++) {
                int num = nums[i];
                if (num <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println("Duplicate number: " + findDuplicate(nums));
    }
}
