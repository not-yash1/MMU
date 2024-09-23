package Sep18;
public class MatrixSearch {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int target = 16;
        System.out.println(searchMatrix(mat, target));
    }

    public static boolean searchMatrix(int[][] mat, int target) {
        int row = 0;
        int col = mat[0].length - 1;
        while(row < mat.length && col >= 0) {
            if(mat[row][col] == target) {
                return true;
            } else if(mat[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    // public static boolean searchMatrix(int[][] A, int target) {
    //     int start=0,end=A.length-1,m=A[0].length-1;
    //     while(start<end){
    //     int mid=(start+end)/2;
    //     if(A[mid][m]==target)return true; // comparing the last element of each row finding the right row
    //     else if(A[mid][m]<target){
    //         start=mid+1;
    //     }
    //     else {
    //         end=mid;
    //     }
    //     }
    //     int j=0; // finding the element in the right row
    //     for(j=0;j<A[0].length;j++){
    //         if(A[start][j]==target){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}
