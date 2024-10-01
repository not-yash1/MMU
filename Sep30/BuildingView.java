public class BuildingView {
    
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 9, 7, 8, 4, 9, 11, 7};
        height(arr);
    }

    public static void height(int[] arr) {
        int n = arr.length;
        int max = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
        System.out.println();
    }
}
