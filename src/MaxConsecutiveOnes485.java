/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/2 0002
 *      desc  :
 * </pre>
 */
public class MaxConsecutiveOnes485 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, maxHere = 0;
        for (int num : nums) {
            max = Math.max(max, maxHere = (num == 0 ? 0 : maxHere + 1));
        }

        return max;
    }
}
