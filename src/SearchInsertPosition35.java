/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/28 0028
 *      desc  :
 * </pre>
 */
public class SearchInsertPosition35 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int i = searchInsert(nums, 1);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
