/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/10 0010
 *      desc  :
 * </pre>
 */
public class MoveZeroes283 {
    public static void main(String[] args) {
        int[] num = {0, 1, 0, 3, 12};
        moveZeroes(num);
        for (int i : num) {
            System.out.println(i);
        }
    }

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int insertIndex = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertIndex++] = num;
            }
        }

        while (insertIndex < nums.length) {
            nums[insertIndex++] = 0;
        }
    }
}
