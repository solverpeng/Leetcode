/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/5/2 0002
 *      desc  :
 * </pre>
 */
public class MaximumSubarray53 {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray(nums);
        System.out.println(i);
    }

    public static int maxSubArray(int[] nums) {
        int maxSofar = nums[0];
        int maxHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxHere = Math.max(maxHere + nums[i], nums[i]);
            maxSofar = Math.max(maxHere, maxSofar);
        }
        return maxSofar;
    }
}
