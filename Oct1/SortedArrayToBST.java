package Oct1;

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

public class SortedArrayToBST {

    public static TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        // SortedArrayToBST obj = new SortedArrayToBST();
        int[] nums = {-10, -3, 0, 1, 5, 9};
        TreeNode root = sortedArrayToBST(nums, 0, nums.length - 1);
        System.out.println(root.right.left.val);
    }
}
