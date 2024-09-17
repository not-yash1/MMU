package Sep13;
import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {



        // 1. Array Declaration and Initialization

            int[] arr1 = new int[4];
            int[] arr2 = {1, 2, 3, 4};
            int[] arr3 = new int[]{1, 2, 3, 4};
            int arr4[] = new int[4];


        // 2. Accessing Array Elements

            int[] arr6 = {1, 2, 3, 4};
            System.out.println(arr6[0]); // Output: 1
            System.out.println(arr6[3]); // Output: 4


        // 3. Array Length

            int[] arr5 = {1, 2, 3, 4};
            System.out.println(arr5.length); // Output: 4


        // 4. Array Index Out of Bounds

            int[] arr7 = {1, 2, 3, 4};
            System.out.println(arr7[5]); // Output: ArrayIndexOutOfBoundsException


        // 5. Array Copy

            int[] arr8 = {1, 2, 3, 4};
            int[] arr9 = new int[4];
            System.arraycopy(arr8, 0, arr9, 0, 4);
            System.out.println(arr9[0]); // Output: 1


        // 6. Types of Arrays

            // 6.1 1D Arrays

            int[] arr10 = {1, 2, 3, 4};

            // 6.2 2D Arrays

            int[][] arr11 = {
                {1, 2, 3}, 
                {4, 5, 6}, 
                {7, 8, 9}
            };

            // 6.3 Jagged Arrays

            int[][] jaggedArray = new int[3][];  // A jagged array with 3 rows
            jaggedArray[0] = new int[2];  // First row has 2 elements
            jaggedArray[1] = new int[4];  // Second row has 4 elements
            jaggedArray[2] = new int[3];  // Third row has 3 elements


        // 7. Array Iteration :

            int[] arr12 = {1, 2, 3, 4};
            for (int i = 0; i < arr12.length; i++) {
                System.out.println(arr12[i]);
            }


        // 8. Array utility class :

            // 8.1 Sorting an Array:

            // import java.util.Arrays;

            // int[] arr = {5, 2, 8, 4, 1};
            // Arrays.sort(arr);  // Sorts the array in ascending order

            // System.out.println(Arrays.toString(arr));  // Output: [1, 2, 4, 5, 8]

        
        // 9. Common errors with array :

            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);  // Throws ArrayIndexOutOfBoundsException
        
        
        // 10. Array limitations : 

            // 10.1 Fixed Size: Arrays in Java have a fixed size, meaning once they are created, their size cannot be changed.

            // 10.2 Homogeneous Elements: All elements in an array must be of the same type.


        // 11. ArrayList:

            // import java.util.ArrayList;

            // ArrayList<Integer> list = new ArrayList<>();
            // list.add(1);
            // list.add(2);
            // list.remove(0);  // Removes the first element


















    }
}

    
