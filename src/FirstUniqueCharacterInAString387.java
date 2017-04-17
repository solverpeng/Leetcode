import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/17 0017
 *      desc  :
 * </pre>
 */
public class FirstUniqueCharacterInAString387 {
    public static void main(String[] args) {
        String word = "leetcode";
        int num = firstUniqChar2(word);
        System.out.println(num);

        String word2 = "loveleetcode";
        int aChar = firstUniqChar2(word2);
        System.out.println(aChar);
    }

    public static int firstUniqChar(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                int value = map.get(s.charAt(i));
                map.put(s.charAt(i), value + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        Character c = null;
        for (Map.Entry<Character, Integer> entry : set) {
            if (entry.getValue() == 1) {
                c = entry.getKey();
                break;
            }
        }
        /*Iterator<Map.Entry<Character, Integer>> iterator = set.iterator();
        Character c = null;
        while(iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            if(entry.getValue() == 1) {
                c = entry.getKey();
                break;
            }
        }*/
        if (c == null) {
            return -1;
        } else {
            return s.indexOf(c);
        }
    }

    public static int firstUniqChar2(String s) {
        int[] nums = new int[26];
        for (int i = 0; i < s.length(); i++) {
            nums[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                return i;
            }
        }
        return -1;
    }


}
