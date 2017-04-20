/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/20 0020
 *      desc  :
 * </pre>
 */
public class Base7 {
    public static void main(String[] args) {
        int num = -7;
        String s = convertToBase72(num);
        System.out.println(s);
    }

    public static String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        boolean flag = false;

        if (num < 0) {
            flag = true;
        }

        StringBuilder builder = new StringBuilder();

        while (num != 0) {
            builder.append(Math.abs(num % 7));
            num = num / 7;
        }
        if (flag) {
            builder.append("-");
        }

        return builder.reverse().toString();
    }

    public static String convertToBase72(int num) {
        if (num < 0) {
            return '-' + convertToBase72(-num);
        }
        if (num < 7) {
            return num + "";
        }
        return convertToBase7(num / 7) + num % 7;
    }
}
