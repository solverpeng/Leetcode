/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/2 0002
 *      desc  :
 * </pre>
 */
public class SingleNumber136 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 5, 4, 6};
        int i = singleNumber(nums);
        System.out.println(i);
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
