/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/13 0013
 *      desc  :
 * </pre>
 */
public class MinimumMovesToEqualArrayElements453 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int minMoves = minMoves(nums);
        System.out.println(minMoves);
    }
    // sum(nums) - n*min
    public static int minMoves(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int min = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
        }

        int result = 0;
        for (int num : nums) {
            result += num - min;
        }
        return result;
    }
}
