package Sep13;


public class SecondMax {
    public static void main(String[] args) {
        int arr[] = { 42, 35, 1, 10, 34, 1 };
        int max = arr[0];
        if(arr.length < 2) {
            System.out.println("-1");
            return;
        }
        boolean flag = false;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                flag = true;
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] < max) {
                flag = true;
                secondMax = arr[i];
            }
        }
        System.out.println(flag ? secondMax : "-1");
    }    
}
