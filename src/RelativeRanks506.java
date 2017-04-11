import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/11 0011
 *      desc  :
 * </pre>
 */
public class RelativeRanks506 {
    public static void main(String[] args) {
        int[] input = {10, 20, 40, 30};
        String[] ranks = findRelativeRanks(input);
        for (String rank : ranks) {
            System.out.println(rank);
        }
    }

    public static String[] findRelativeRanks(int[] nums) {
        Integer[] index = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            index[i] = i;
        }

        Arrays.sort(index, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return (nums[b] - nums[a]);
            }
        });

        for (Integer integer : index) {
            System.out.println(integer);
        }

        String[] result = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[index[i]] = "Gold Medal";
            }
            else if (i == 1) {
                result[index[i]] = "Silver Medal";
            }
            else if (i == 2) {
                result[index[i]] = "Bronze Medal";
            }
            else {
                result[index[i]] = (i + 1) + "";
            }
        }

        return result;
    }

    public static String[] findRelativeRanks2(int[] nums) {
        Integer[] integerNum = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            integerNum[i] = nums[i];
        }
        Arrays.sort(integerNum, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        List<Integer> list = Arrays.asList(integerNum);

        String[] result = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int index = list.indexOf(nums[i]);
            if (index == 0) {
                result[i] = "Gold Medal";
            } else if (index == 1) {
                result[i] = "Silver Medal";
            } else if (index == 2) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = String.valueOf(i + 4);
            }
        }

        return result;
    }
}
