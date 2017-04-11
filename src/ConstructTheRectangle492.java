/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/10 0010
 *      desc  :
 * </pre>
 */
public class ConstructTheRectangle492 {
    public static void main(String[] args) {
        int[] ints = constructRectangle(99);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            w--;
        }
        return new int[]{area / w, w};
    }
}
