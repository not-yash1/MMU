package Oct1;

import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class ZIgZagTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A = zigZagTraversal(root, A, 0);
        print(A);
    }

    public static ArrayList<ArrayList<Integer>> zigZagTraversal(TreeNode root, ArrayList<ArrayList<Integer>> A, int h) {
        if (root == null) {
            return A;
        }
        if (h >= A.size()) {
            A.add(new ArrayList<>());
        }
        A.get(h).add(root.val);
        zigZagTraversal(root.left, A, h + 1);
        zigZagTraversal(root.right, A, h + 1);
        return A;
    }

    public static void print(ArrayList<ArrayList<Integer>> A) {
        boolean flag = true;
        for (int i = 0; i < A.size(); i++) {
            if (flag) {
                for (int j = 0; j < A.get(i).size(); j++) {
                    System.out.print(A.get(i).get(j) + " ");
                }
                flag = false;
            } else {
                for (int j = A.get(i).size() - 1; j >= 0; j--) {
                    System.out.print(A.get(i).get(j) + " ");
                }
                flag = true;
            }
            System.out.println();
        }
    }
}
