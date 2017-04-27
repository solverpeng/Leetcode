/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/27 0027
 *      desc  :
 * </pre>
 */
public class HappyNumber202 {
    public static void main(String[] args) {
        boolean happy = isHappy(38);
        System.out.println(happy);
    }

    public static boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        } while(slow != fast);
        if (slow == 1)
            return true;
        else return false;
    }

    public static int digitSquareSum(int n) {
        int sum = 0, temp;
        while (n > 0) {
            temp = n % 10;
            sum += temp * temp;
            n /= 10;
        }
        return sum;
    }
}
