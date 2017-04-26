/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/26 0026
 *      desc  :
 * </pre>
 */
public class ConvertSortedArrayBinarySearchTree108 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        TreeNode treeNode = sortedArrayToBST(nums);
        System.out.println(treeNode.val);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return helper(nums, 0, nums.length - 1);
    }

    private static TreeNode helper(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }

        int mid = (low + high) / 2;

        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, low, mid - 1);
        node.right = helper(nums, mid + 1, high);

        return node;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
