public class PivotElementFinder {

    // Function to find the pivot element in a rotated sorted array
    public static int findPivot(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        // Edge case: If the array is not rotated, the first element is the pivot
        if (arr[low] < arr[high]) {
            return arr[low];
        }

        while (low <= high) {
            // Calculate mid index
            int mid = low + (high - low) / 2;

            // Check if mid is the pivot element
            if (mid < high && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1]; // Pivot is at mid+1
            }

            // Check if mid-1 is the pivot element
            if (mid > low && arr[mid] < arr[mid - 1]) {
                return arr[mid]; // Pivot is at mid
            }

            // If the left side is sorted, pivot must be in the right side
            if (arr[low] <= arr[mid]) {
                low = mid + 1;
            }
            // Otherwise, pivot is in the left side
            else {
                high = mid - 1;
            }
        }

        return -1; // This case will not occur if the array is rotated
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};  // Example input: rotated sorted array
        int pivotElement = findPivot(arr);

        if (pivotElement != -1) {
            System.out.println("The pivot element is: " + pivotElement);
        } else {
            System.out.println("The array is not rotated.");
        }
    }
}
