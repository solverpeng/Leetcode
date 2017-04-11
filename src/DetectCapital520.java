/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/5 0005
 *      desc  :
 * </pre>
 */
public class DetectCapital520 {
    public static void main(String[] args) {
        String word = "FlaG";
        boolean b = detectCapitalUse2(word);
        System.out.println(b);
    }

    public static boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }

    public static boolean detectCapitalUse2(String word) {
        int count = 0;
        for (int i = 0; i < word.toCharArray().length; i++) {
            if ('Z' - word.charAt(i) < 0) {
                count++;
            }
        }

        return (count == 0 | count == word.length()) | (count == 1 && 'Z' - word.charAt(0) >= 0);
    }
    // ASCII: A-Z 65-90 a-z 97-122
}
