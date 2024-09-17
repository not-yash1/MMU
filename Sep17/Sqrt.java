package Sep17;
public class Sqrt {
    public static void main(String[] args) {
        int n = 16;
        int ans = sqrt(n);
        System.out.println(ans);
    }
    public static int sqrt(int n) {
        int start = 0;
        int end = n;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid*mid == n) {
                return mid;
            }
            if(mid*mid < n) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
