/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/6 0006
 *      desc  :
 * </pre>
 */
public class MaximumDepthofBinaryTree104 {
    public static void main(String[] args) {
        TreeNode l2 = new TreeNode(1, null, null);//这五行构造一棵二叉树
        TreeNode r2 = new TreeNode(2, null, null);
        TreeNode l1 = new TreeNode(3,null, r2);// 根节点左子树
        TreeNode r1 = new TreeNode(4, l2, null);// 根节点右子树
        TreeNode root = new TreeNode(5, l1, r1);// 创建根节点

        int i = maxDepth(root);
        System.out.println(i);
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        TreeNode(int x) {
            val = x;
        }
    }
}


