/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/5/2 0002
 *      desc  :
 * </pre>
 */
public class ClimbingStairs70 {
    public static void main(String[] args) {
        int i = climbStairs(6);
        System.out.println(i);
    }

    public static int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int totalWays = 0;
        int oneStepBefore = 2;
        int twoStepBefore = 1;

        for (int i = 2; i < n; i++) {
            totalWays = oneStepBefore + twoStepBefore;
            twoStepBefore = oneStepBefore;
            oneStepBefore = totalWays;
        }
        return totalWays;
    }
}
