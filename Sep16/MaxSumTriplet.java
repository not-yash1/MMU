package Sep16;


public class MaxSumTriplet {
    public static void main(String[] args) {
        int[] arr = {11, 2, 13, 4, 5};
        if(arr.length < 3){
            System.out.println("-1");
            return;
        }
        System.out.println(maxTriplet(arr));
    }

    public static int maxTriplet(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if(arr[i] > thirdMax) {
                thirdMax = arr[i];
            }
        }
        return max + secondMax + thirdMax;
    }
}
