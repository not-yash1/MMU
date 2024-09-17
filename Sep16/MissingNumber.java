package Sep16;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int total = n * (n + 1) / 2;
        for(int i = 0; i < n; i++) {
            total -= arr[i];
        }
        System.out.println(total);
    }
}
