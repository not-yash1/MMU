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

public class RightViewOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A = levelOrderTraversal(root, A, 0);
        print(A);
    }

    public static ArrayList<ArrayList<Integer>> levelOrderTraversal(TreeNode root, ArrayList<ArrayList<Integer>> A, int h) {
        if (root == null) {
            return A;
        }
        if (h >= A.size()) {
            A.add(new ArrayList<>());
        }
        A.get(h).add(root.val);
        levelOrderTraversal(root.left, A, h + 1);
        levelOrderTraversal(root.right, A, h + 1);
        return A;
    }

    public static void print(ArrayList<ArrayList<Integer>> A) {
        for (int i = 0; i < A.size(); i++) {
            System.out.println(A.get(i).get(A.get(i).size() - 1));
        }
    }
}
