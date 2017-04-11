/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/3/30 0030
 *      desc  :
 * </pre>
 */
public class NumberComplement476 {
    public static void main(String[] args) {
        int complement = findComplement(1);
        System.out.println(complement);
    }

    public static int findComplement(int num) {
        return ~num & (Integer.highestOneBit(num) - 1);
    }
}
