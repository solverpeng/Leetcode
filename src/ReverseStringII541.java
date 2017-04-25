/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/25 0025
 *      desc  :
 * </pre>
 */
public class ReverseStringII541 {
    public static void main(String[] args) {
        String abcdefg = reverseStr("abcdefg", 2);
        System.out.println(abcdefg);

    }

    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int i = 0;
        int n = chars.length;
        while (i < n) {
            int j = Math.min(i + k - 1, n - 1);
            swap(chars, i, j);
            i = i + 2 * k;
        }
        return String.valueOf(chars);
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i++] = chars[j];
        chars[j--] = temp;
    }


}
