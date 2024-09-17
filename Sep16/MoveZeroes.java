package Sep16;


public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int n = arr.length;
        int[] temp = new int[n];
        moveZeroes(arr);
        for(int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }

    // public static void moveZeroes(int[] arr, int[] temp) {
    //     int n = arr.length;
    //     int j = 0;
    //     for(int i = 0; i < n; i++) {
    //         if(arr[i] != 0) {
    //             temp[j++] = arr[i];
    //         }
    //     }
    // }

    public static void moveZeroes(int[] arr) {
        int n = arr.length;
        int j = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0 && i != j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
