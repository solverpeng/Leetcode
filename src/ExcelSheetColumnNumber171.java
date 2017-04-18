/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/18 0018
 *      desc  :
 * </pre>
 */
public class ExcelSheetColumnNumber171 {
    public static void main(String[] args) {
        int aa = titleToNumber("BA");
        System.out.println(aa);
    }

    public static int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }

        return result;
    }
}
