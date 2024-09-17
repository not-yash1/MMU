package Sep13;
public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 4, 5};
        System.out.println(isIncreasing(arr) || isDecreasing(arr) ? "Array is sorted" : "Array is not sorted");
    }

    public static boolean isIncreasing(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] < arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
