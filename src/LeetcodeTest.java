import java.util.*;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/2 0002
 *      desc  :
 * </pre>
 */
public class LeetcodeTest {
    public static void main(String[] args) {
        /*String[] str = {"Hello", "Alaska", "Dad", "Peace"};
        String[] words = findWords(str);
        for (String word : words) {
            System.out.println(word);
        }*/

        /*List<String> strings = fizzBuzz(15);
        System.out.println(strings);*/

        /*String hello = reverseString("hello");
        System.out.println(hello);*/

        /*int[] findNums = {4, 1, 2};
        int[] nums = {1, 3, 4, 2};*/

        /*int[] findNums = {2, 4};
        int[] nums = {1, 2, 3, 4};

        int[] ints = nextGreaterElement(findNums, nums);
        for (int anInt : ints) {
            System.out.println(anInt);
        }*/

        /*int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        int i = islandPerimeter(grid);
        System.out.println(i);*/

    }

    public static int islandPerimeter(int[][] grid) {
        int island = 0;
        int neighbors = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    island++;
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                        neighbors++;
                    }
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) {
                        neighbors++;
                    }
                }
            }
        }

        return island * 4 - neighbors * 2;
    }

    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] result = new int[findNums.length];
        int m = 0;
        for (int findNum : findNums) {
            int index = -1;
            for (int i = 0; i < nums.length; i++) {
                if (findNum == nums[i]) {
                    index = i;
                }
            }
            int greaterNum = -1;
            for (int i = index + 1; i < nums.length; i++) {
                if (nums[i] > findNum) {
                    greaterNum = nums[i];
                    break;
                }
            }
            result[m] = greaterNum;
            m++;
        }

        return result;
    }

    public static String reverseString(String string) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return String.valueOf(chars);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new LinkedList<>();
        for (int i = 1, fizz = 0, bizz = 0; i <= n; i++) {
            fizz++;
            bizz++;
            if (fizz == 3 && bizz == 5) {
                result.add("FizzBizz");
                fizz = 0;
                bizz = 0;
                continue;
            }
            if (fizz == 3) {
                result.add("Fizz");
                fizz = 0;
                continue;
            }
            if (bizz == 5) {
                result.add("Bizz");
                bizz = 0;
                continue;
            }
            result.add(String.valueOf(i));
        }

        return result;
    }

    public static String[] findWords(String[] words) {
        String[] rules = {"qwertyuiop", "asdfghkl", "zxcvbnm"};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < rules.length; i++) {
            for (char c : rules[i].toCharArray()) {
                map.put(c, i);
            }
        }

        List<String> result = new LinkedList<>();

        for (String word : words) {
            char[] chars = word.toLowerCase().toCharArray();
            Integer index = map.get(chars[0]);
            for (char aChar : chars) {
                if (!Objects.equals(index, map.get(aChar))) {
                    index = -1;
                    break;
                }
            }
            if (!Objects.equals(index, -1)) {
                result.add(word);
            }
        }

        return result.toArray(new String[result.size()]);
    }
}
