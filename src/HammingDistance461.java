/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/3/30 0030
 *      desc  :
 * </pre>
 */
public class HammingDistance461 {
    public static void main(String[] args) {
        int i = hammingDistance(4, 2);
        System.out.println(i);
    }

    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
