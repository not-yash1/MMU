package Sep17;
public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5};
        int n = arr.length;
        int x = 1;
        int ans = upperBound(arr, x);
        System.out.println(ans>n-1 ? "Upper bound does not exist" : arr[ans]);
    }

    public static int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
