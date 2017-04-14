/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/13 0013
 *      desc  :
 * </pre>
 */
public class RansomNote383 {
    public static void main(String[] args) {
        boolean b = canConstruct("aa", "aab");
        System.out.println(b);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
        return true;
    }
}
