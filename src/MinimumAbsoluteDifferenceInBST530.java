/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/11 0011
 *      desc  :
 * </pre>
 */
public class MinimumAbsoluteDifferenceInBST530 {
    static int min = Integer.MAX_VALUE;
    static Integer prev = null;
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(40);

        TreeNode treeNode1 = new TreeNode(25);
        TreeNode treeNode2 = new TreeNode(18);
        TreeNode treeNode3 = new TreeNode(28);

        TreeNode treeNode4 = new TreeNode(80);
        TreeNode treeNode5 = new TreeNode(43);
        TreeNode treeNode6 = new TreeNode(100);

        treeNode.left = treeNode1;
        treeNode.right = treeNode4;

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode4.left = treeNode5;
        treeNode4.right = treeNode6;

        int minimumDifference = getMinimumDifference(treeNode);
        System.out.println(minimumDifference);
    }

    public static int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return min;
        }

        getMinimumDifference(root.left);

        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;

        getMinimumDifference(root.right);

        return min;
    }

    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
