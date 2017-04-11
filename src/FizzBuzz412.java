import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/3/30 0030
 *      desc  :
 * </pre>
 */
public class FizzBuzz412 {
    public static void main(String[] args) {
        List<String> strings = fizzBuzz(15);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<>(n);
        for (int i = 1, fizz = 0, bizz = 0; i <= n; i++) {
            fizz++;
            bizz++;

            if (fizz == 3 && bizz == 5) {
                ret.add("FizzBizz");
                fizz = 0;
                bizz = 0;
                continue;
            }
            if (fizz == 3) {
                ret.add("Fizz");
                fizz = 0;
                continue;
            }
            if (bizz == 5) {
                ret.add("Bizz");
                bizz = 0;
                continue;
            }
            ret.add(String.valueOf(i));
        }

        return ret;
    }
}
