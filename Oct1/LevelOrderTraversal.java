package Oct1;

import java.util.*;

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

public class LevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A = levelOrder(root, A, 0);
        print(A);
    }

    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root, ArrayList<ArrayList<Integer>> A, int h) {
        if (root == null) {
            return A;
        }
        if (h >= A.size()) {
            A.add(new ArrayList<>());
        }
        A.get(h).add(root.val);
        levelOrder(root.left, A, h + 1);
        levelOrder(root.right, A, h + 1);
        return A;
    }

    public static void print(ArrayList<ArrayList<Integer>> A) {
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < A.get(i).size(); j++) {
                System.out.print(A.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
