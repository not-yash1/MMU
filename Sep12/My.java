package Sep12;




import java.util.*;

public class My {
    public static void main (String[] args){
        int arr[] = {5, 1, 8, 6, 7, 0, 9};
        int n = arr.length;
        int s1=0;
        int s2=0;
        for(int i=0; i<n/2; i++){
            s1+=arr[i];
        }
        for(int i=n/2; i<n; i++){
            s2+=arr[i];
        }

        System.out.println((s2-s1>0) ? s2-s1 : s1-s2);
        // System.out.println(s2-s1);
        
    }
}







// class FibonacciIterative {
//     public static int fib(int n) {
//         if (n <= 1) {
//             return n;
//         }

//         int a = 0, b = 1;
//         int c = 0;
//         for (int i = 2; i <= n; i++) {
//             c = a + b;
//             a = b;
//             b = c;
//         }

//         return b;
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         System.out.println("Fibonacci number at position " + n + " is " + fib(n));
//     }
// }


// class FibonacciRecursive {
//     public static int fib(int n) {
//         if (n <= 1) {
//             return n;
//         }
//         return fib(n - 1) + fib(n - 2);
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println("Fibonacci number at position " + n + " is " + fib(n));
//     }
// }
