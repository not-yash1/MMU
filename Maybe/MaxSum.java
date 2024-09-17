package Maybe;


public class MaxSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int curSum = 0;
        for(int i=0; i<arr.length; i++)
        {
            curSum += arr[i];
            curSum = Math.max(curSum, Integer.MIN_VALUE);
            if(curSum < 0)
            curSum = 0;
        }

        System.out.println(curSum);
        
    }
}
