import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/3/31 0031
 *      desc  :
 * </pre>
 */
public class NextGreaterElementI496 {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
//        int[] nums1 = {2, 4};
//        int[] nums2 = {1, 2, 3, 4};
        int[] result = nextGreaterElement(nums1, nums2);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] nextGreaterElement3(int[] findNums, int[] nums) {
        int[] result = new int[findNums.length];
        for (int i = 0; i < findNums.length; i++) {
            int indexOfNums = -1;
            for (int m = 0; m < nums.length; m++) {
                if (findNums[i] == nums[m]) {
                    indexOfNums = m;
                }
            }
            for (int j = indexOfNums; j < nums.length; j++) {
                if (nums[j] > nums[indexOfNums]) {
                    result[i] = nums[j];
                    break;
                }
                if (j == nums.length - 1 && nums[j] <= nums[indexOfNums]) {
                    result[i] = -1;
                }
            }
        }

        return result;
    }


    public static int[] nextGreaterElement2(int[] findNums, int[] nums) {
        List<Integer> numList = new ArrayList<>(nums.length);
        for (int num : nums) {
            numList.add(num);
        }

        int[] result = new int[findNums.length];
        for (int i = 0; i < findNums.length; i++) {
            int indexOfNums = numList.indexOf(findNums[i]);
            for (int j = indexOfNums; j < nums.length; j++) {
                if (nums[j] > nums[indexOfNums]) {
                    result[i] = nums[j];
                    break;
                }
                if (j == nums.length - 1 && nums[j] <= nums[indexOfNums]) {
                    result[i] = -1;
                }
            }
        }

        return result;
    }

    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] result = new int[findNums.length];
        for (int i = 0; i < findNums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (findNums[i] == nums[j]) {
                    for (int m = j; m < nums.length; m++) {
                        if (nums[m] > nums[j]) {
                            result[i] = nums[m];
                            break;
                        }
                        if (m == nums.length - 1 && nums[m] <= nums[j]) {
                            result[i] = -1;
                        }
                    }
                }
            }
        }

        return result;
    }
}
