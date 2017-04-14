import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/14 0014
 *      desc  :
 * </pre>
 */
public class IntersectionOfTwoArrays349 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] ints = intersection(nums1, nums2);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
            }
        }

        int[] result = new int[intersectionSet.size()];
        Iterator<Integer> iterator = intersectionSet.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            result[i++] = iterator.next();
        }

        return result;
    }
}
