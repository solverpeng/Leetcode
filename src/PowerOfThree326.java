/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/27 0027
 *      desc  :
 * </pre>
 */
public class PowerOfThree326 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        int pow = (int) Math.pow(3, 19);
        System.out.println(pow);

    }

    public boolean isPowerOfThree(int n) {
        return n != 0 && 1162261467 % n == 0;
    }

    public boolean isPowerOfThree2(int n) {
        return Integer.toString(n, 3).matches("10*");
    }
}
