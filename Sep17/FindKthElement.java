package Sep17;


public class FindKthElement {
    // public static int find(int[] arr1, int[] arr2, int m, int n, int k) {
    //     int d = 0, i = 0, j = 0;

    //     while (i < m && j < n) {
    //         if (arr1[i] < arr2[j]) {
    //             d++;
    //             if (d == k)
    //                 return arr1[i];
    //             i++;
    //         } else {
    //             d++;
    //             if (d == k)
    //                 return arr2[j];
    //             j++;
    //         }
    //     }

    //     while (i < m) {
    //         d++;
    //         if (d == k)
    //             return arr1[i];
    //         i++;
    //     }

    //     while (j < n) {
    //         d++;
    //         if (d == k)
    //             return arr2[j];
    //         j++;
    //     }
    //     return -1;
    // }

    public static int find(int[] arr1, int[] arr2, int m, int n, int k) {
        int d = 0, i = 0, j = 0;

        // while(k>1){
        //     if(arr1[i] < arr2[j]){
        //         i++;
        //         k--;
        //     } else {
        //         j++;
        //         k--;
        //     }
        // }






        
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                d++;
                if (d == k)
                    return arr1[i];
                i++;
            } else {
                d++;
                if (d == k)
                    return arr2[j];
                j++;
            }
        }

        while (i < m) {
            d++;
            if (d == k)
                return arr1[i];
            i++;
        }

        while (j < n) {
            d++;
            if (d == k)
                return arr2[j];
            j++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] A = {2, 3, 6, 7, 9};
        int[] B = {1, 4, 8, 10};
        int k = 5;
        int m = A.length;
        int n = B.length;

        System.out.println(find(A, B, m, n, k));
    }
}
