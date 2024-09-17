package Sep17;


public class FindKthElement {
    public static int find(int[] arr1, int start1, int end1, int[] arr2, int start2, int end2, int k) {
        if (start1 == end1) {
            return arr2[start2 + k];
        }
        if (start2 == end2) {
            return arr1[start1 + k];
        }
        int mid1 = (start1 + end1) / 2;
        int mid2 = (start2 + end2) / 2;
        if (mid1 - start1 + mid2 - start2 < k) {
            if (arr1[mid1] > arr2[mid2]) {
                return find(arr1, start1, end1, arr2, mid2 + 1, end2, k - (mid2 - start2) - 1);
            } else {
                return find(arr1, mid1 + 1, end1, arr2, start2, end2, k - (mid1 - start1) - 1);
            }
        } else {
            if (arr1[mid1] > arr2[mid2]) {
                return find(arr1, start1, mid1, arr2, start2, end2, k);
            } else {
                return find(arr1, start1, end1, arr2, start2, mid2, k);
            }
        }
    }

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

    public static void main(String[] args) {
        int[] A = {2, 3, 6, 7, 9};
        int[] B = {1, 4, 8, 10};
        int k = 5;
        int m = A.length;
        int n = B.length;

        System.out.println(find(A, 0, m, B, 0, n, k - 1));
        // System.out.println(find(A, B, m, n, k));
    }
}
