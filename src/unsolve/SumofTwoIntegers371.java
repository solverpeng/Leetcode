package unsolve;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/7 0007
 *      desc  :
 * </pre>
 */
public class SumofTwoIntegers371 {

    public static void main(String[] args) {
        int sum = getSum(10, 20);
        System.out.println(sum);
    }

    // https://discuss.leetcode.com/topic/49771/java-simple-easy-understand-solution-with-explanation
    public static int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }
}
