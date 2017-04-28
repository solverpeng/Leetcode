/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/28 0028
 *      desc  :
 * </pre>
 */
public class PowerTwo231 {
    public static void main(String[] args) {
        int i = 32 & 31;
        System.out.println(i);
    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }

    public static boolean isPowerOfTwo2(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
