/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/12 0012
 *      desc  :
 * </pre>
 */
public class TwoSumIIInputArrayIsSorted167 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int[] ints = twoSum(numbers, 9);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] indexes = new int[2];
        if (numbers == null || numbers.length < 2) {
            return indexes;
        }
        int startIndex = 0, endIndex = numbers.length - 1;
        while (numbers[startIndex] < numbers[endIndex]) {
            int v = numbers[startIndex] + numbers[endIndex];
            if (v == target) {
                indexes[0] = startIndex + 1;
                indexes[1] = endIndex + 1;
                break;
            } else if (v > target) {
                endIndex--;
            } else {
                startIndex++;
            }
        }

        return indexes;
    }
}
