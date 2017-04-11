/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/7 0007
 *      desc  :
 * </pre>
 */
public class InvertBinaryTree226 {
    public static void main(String[] args) {
        InvertBinaryTree226 invertBinaryTree226 = new InvertBinaryTree226();
        TreeNode root = new TreeNode(4);

        TreeNode left = new TreeNode(2);
        TreeNode leftleft = new TreeNode(1);
        TreeNode leftRight = new TreeNode(3);

        TreeNode right = new TreeNode(7);
        TreeNode rightLeft = new TreeNode(6);
        TreeNode rightRight = new TreeNode(9);

        root.left = left;
        root.right = right;

        left.left = leftleft;
        left.right = leftRight;

        right.left = rightLeft;
        right.right = rightRight;

        TreeNode treeNode = invertBinaryTree226.invertTree(root);
        System.out.println(treeNode.left.left.val);

    }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = root.right;
        TreeNode left = root.left;

        root.left = invertTree(right);
        root.right = invertTree(left);
        return  root;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
