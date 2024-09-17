package Sep13;


import java.util.*;
public class FindPair {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        findPair(arr, target);
    }

    // public static void findPair(int[] arr, int target) {
    //     boolean flag = false;
    //     for(int i = 0; i < arr.length; i++) {
    //         for(int j = i+1; j < arr.length; j++) {
    //             if(arr[i] + arr[j] == target) {
    //                 flag = true;
    //                 System.out.println(arr[i] + ", " + arr[j]);
    //             }
    //         }
    //     }
    //     if(!flag) {
    //         System.out.println("Such pair does not exist");
    //     }
    // }

    public static void findPair(int[] arr, int target) {
        boolean flag = false;
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i < j) {
            if(arr[i] + arr[j] == target) {
                flag = true;
                System.out.println(arr[i] + ", " + arr[j]);
                i++;
                j--;
            } else if(arr[i] + arr[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        if(!flag) {
            System.out.println("Such pair does not exist");
        }
    }
}
