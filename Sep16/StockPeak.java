package Sep16;


public class StockPeak {
    public static void main(String[] args) {
        int arr [] = {10, 40, 80, 120, 200, 250, 255};
        int n = arr.length;
        // int peak = 0;
        // for(int i = 1; i < n-1; i++) {
        //     if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
        //         peak = i;
        //         break;
        //     }
        // }
        // System.out.println(peak);










        int start = 0;
        int end = n-1;
        int mid;
        boolean flag = false;

        while(start < end) {
            mid = start + (end - start) / 2;

            if(arr[mid-1] > arr[mid] && arr[mid] > arr[mid+1]) {
                end = mid;
            } else if(arr[mid-1] < arr[mid] && arr[mid] < arr[mid+1]) {
                start = mid + 1;
            } else if (arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]) {
                System.out.println(mid);
                flag = true;
                break;
            }
        }

        if(!flag) {
            System.out.println(-1);
        }
    }
    
}
