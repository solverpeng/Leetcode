/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/26 0026
 *      desc  :
 * </pre>
 */
public class AddStrings415 {
    public static void main(String[] args) {
        String num1 = "623456";
        String num2 = "654789";
        String s = addStrings(num1, num2);
        System.out.println(s);
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int carry = 0;
        for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--) {
            int c1 = i < 0 ? 0 : num1.charAt(i) - '0';
            int c2 = j < 0 ? 0 : num2.charAt(j) - '0';
            int sum = (c1 + c2 + carry) % 10;
            stringBuilder.append(sum);
            carry = (c1 + c2 + carry) / 10;
        }

        return stringBuilder.reverse().toString();
    }
}
