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

public class PathToGivenNode {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.right.right = new TreeNode(8);
        ArrayList<Integer> A = new ArrayList<>();
        A = pathToNode(root, A, 8);
        System.out.println(A);
        // System.out.println(pathToNode(root, 8));
    }

    public static ArrayList<Integer> pathToNode(TreeNode root, ArrayList<Integer> A, int target) {
        if (root == null) {
            return A;
        }
        if (root.val == target) {
            A.add(root.val);
            return A;
        }
        A.add(root.val);
        pathToNode(root.left, A, target);
        pathToNode(root.right, A, target);
        return A;
    }
}
