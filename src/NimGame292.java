/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/1 0001
 *      desc  :
 * </pre>
 */
public class NimGame292 {

    public static void main(String[] args) {
        boolean b = canWinNim(15);
        System.out.println(b);
    }

    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
