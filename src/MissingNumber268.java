/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/25 0025
 *      desc  :
 * </pre>
 */
public class MissingNumber268 {
    public static void main(String[] args) {
        int i = missingNumber(new int[]{0, 1, 3});
        System.out.println(i);
    }

    public static int missingNumber(int[] nums) {
        int sum = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum += i - nums[i];
        }

        return sum;
    }
}
