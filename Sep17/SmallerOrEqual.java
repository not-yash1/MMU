package Sep17;

public class SmallerOrEqual {
    public static int binarySearchCount(int arr[], int n, int key)
    {
        int left = 0, right = n;
        int mid = 0;
        while (left < right) {
            mid = (right + left)/2;
    
            if (arr[mid] == key) {
                while (mid + 1 < n && arr[mid + 1] == key)
                mid++;
                break;
            }
        
            else if (arr[mid] > key)
                right = mid;
        
            else
                left = mid + 1;
        }
    
        while (mid > -1 && arr[mid] > key)
        mid--;
    
        return mid + 1;
    }
    
    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 4, 5, 8, 10 };
        int key = 8;
        int n = arr.length;
        System.out.println(binarySearchCount(arr, n, key));
    }
}    
