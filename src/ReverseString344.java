/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/3/31 0031
 *      desc  :
 * </pre>
 */
public class ReverseString344 {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = reverseString(s);
        System.out.println(s1);
    }

    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int length = s.length();

        for (int i = 0; i < length/2; i++) {
            char temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }

        return String.valueOf(chars);
    }
}
