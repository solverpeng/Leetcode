import java.util.Arrays;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/12 0012
 *      desc  :
 * </pre>
 */
public class AssignCookies455 {
    public static void main(String[] args) {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};

        int[] g2 = {1, 2, 3};
        int[] s2 = {1, 1};
        int contentChildren = findContentChildren(g2, s2);
        System.out.println(contentChildren);

    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int i = 0, j = 0;
        while (!(i >= g.length || j >= s.length)) {
            if (s[j] >= g[i]) {
                result++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return result;
    }

}
