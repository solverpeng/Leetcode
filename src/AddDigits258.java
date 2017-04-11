/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/7 0007
 *      desc  :
 * </pre>
 */
public class AddDigits258 {
    public static void main(String[] args) {
        int i = addDigits(99);
        System.out.println(i);
    }

    public static int addDigits(int num) {
        return num == 0 ? 0 : (num % 9 == 0 ? 9 : (num % 9));
    }
}
