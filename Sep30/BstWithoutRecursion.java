import java.util.Stack;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BstWithoutRecursion {
    TreeNode root;

    public boolean isBST(TreeNode root) {
        if (root == null) return true;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode previous = null;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();

            if (previous != null && current.data <= previous.data) {
                return false;
            }

            previous = current;

            current = current.right;
        }

        return true;
    }

    public static void main(String[] args) {
        BstWithoutRecursion tree = new BstWithoutRecursion();

        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(5);
        tree.root.right = new TreeNode(15);
        tree.root.left.left = new TreeNode(2);
        tree.root.left.right = new TreeNode(7);
        tree.root.right.right = new TreeNode(20);

        if (tree.isBST(tree.root)) {
            System.out.println("The tree is a binary search tree.");
        } else {
            System.out.println("The tree is not a binary search tree.");
        }
    }
}
