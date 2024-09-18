package Sep18;
public class PivotElementFinder {

    public static int findPivot(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        if (arr[low] < arr[high]) {
            return low;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid < high && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }

            if (mid > low && arr[mid] < arr[mid - 1]) {
                return mid;
            }

            if (arr[low] <= arr[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int pivotIndex = findPivot(arr);

        if (pivotIndex != -1) {
            System.out.println("The pivot index is: " + pivotIndex);
        } else {
            System.out.println("The array is not rotated.");
        }
    }
}
