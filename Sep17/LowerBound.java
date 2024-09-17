package Sep17;
public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5};
        int n = arr.length;
        int x = 6;
        int ans = lowerBound(arr, n, x);
        // int ans = lowerBound(arr, x);
        System.out.println(ans==0 ? -1 : arr[ans-1]);
    }

    public static int lowerBound(int[] arr, int n, int x){
        int start = 0, end = n-1, mid;

        while(start < end){
            mid = (start+end)/2;
            if(arr[mid] == x){
                return mid;
            } else if(arr[mid] > x){
                end = mid;
            } else {
                if(mid+1 >= n){
                    return -1;
                }
                if(arr[mid+1] == x || arr[mid+1] > x){
                    return mid;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    public static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
