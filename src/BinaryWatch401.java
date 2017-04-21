import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/21 0021
 *      desc  :
 * </pre>
 */
public class BinaryWatch401 {
    public static void main(String[] args) {
        List<String> strings = readBinaryWatch(3);
        System.out.println(strings.size());

    }

    public static List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<>();
        for (int h = 1; h <= 12; h++) {
            for(int m = 1; m <= 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == num) {
                    list.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return list;
    }
}
