import java.util.HashSet;
import java.util.Set;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/20 0020
 *      desc  :
 * </pre>
 */
public class LongestPalindrome409 {
    public static void main(String[] args) {
        String s = "AAAA";
        int i = longestPalindrome2(s);
        System.out.println(i);
    }

    public static int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int[] lowercase = new int[26];
        int[] uppercase = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - 'Z' <= 0) {
                uppercase[s.charAt(i) - 'A']++;
            } else {
                lowercase[s.charAt(i) - 'a']++;
            }
        }

        int lowerLength = 0;
        int upperLength = 0;

        for (int lower : lowercase) {
            if (lower > 1) {
                lowerLength += (lower % 2 == 0 ? lower : lower - 1);
            }
        }

        for (int upper : uppercase) {
            if (upper > 1) {
                upperLength += (upper % 2 == 0 ? upper : upper - 1);
            }
        }

        int result = lowerLength + upperLength;

        return result < s.length() ? result + 1 : result;
    }

    public static int longestPalindrome2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int count = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
                count++;
            } else {
                set.add(s.charAt(i));
            }
        }

        if (!set.isEmpty()) {
            return count * 2 + 1;
        } else {
            return count * 2;
        }
    }
}
