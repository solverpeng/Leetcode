package unsolve;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/24 0024
 *      desc  :
 * </pre>
 */
public class ReverseWordsStringIII557 {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        String s = reverseWords(str);
        System.out.println(s);
    }

    public static String reverseWords(String s) {
        if(s == null || s.length() == 0) {
            return null;
        }
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : words) {
            char[] c = word.toCharArray();
            int i = 0;
            int j = word.length() - 1;
            while(i < j) {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
            result.append(String.valueOf(c)).append(" ");
        }

        return result.toString().substring(0, result.length() - 2);
    }
}
