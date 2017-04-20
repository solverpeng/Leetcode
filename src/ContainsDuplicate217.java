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
public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        boolean b = containsDuplicate(nums);

    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
