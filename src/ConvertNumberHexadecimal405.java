/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/26 0026
 *      desc  :
 * </pre>
 */
public class ConvertNumberHexadecimal405 {
    public static void main(String[] args) {
        System.out.println(100 & 15);
        int num = -1;
        String s = toHex(num);
        System.out.println(s);
    }

    public static String toHex(int num) {
        if(num == 0) {
            return "0";
        }
        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            result.insert(0, map[(num & 15)]);
            num = (num >>> 4);
        }

        return result.toString();
    }
}
