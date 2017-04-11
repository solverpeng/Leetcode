import java.util.*;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/3/30 0030
 *      desc  :
 * </pre>
 */
public class KeyboardRow500 {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = findWords(words);
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static String[] findWords(String[] words) {
        String[] rule = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < rule.length; i++) {
            for (char c : rule[i].toCharArray()) {
                map.put(c, i);
            }
        }

        List<String> result = new LinkedList<>();
        for (String word : words) {
            if (Objects.equals("", word)) {
                continue;
            }
            Integer index = map.get(word.toLowerCase().charAt(0));
            for (char c : word.toLowerCase().toCharArray()) {
                if (!Objects.equals(map.get(c), index)) {
                    index = -1;
                    break;
                }
            }
            if (index != -1) {
                result.add(word);
            }

        }

        return result.toArray(new String[result.size()]);
    }
}
