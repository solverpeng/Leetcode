/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/14 0014
 *      desc  :
 * </pre>
 */
public class SumOfLeftLeaves404 {
    public static void main(String[] args) {

    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int result = 0;
        if (root.left != null) {
            if (root.left.left != null && root.left.right != null) {
                result += root.left.val;
            } else {
                result += sumOfLeftLeaves(root.left);
            }
        }

        result += sumOfLeftLeaves(root.right);

        return result;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
