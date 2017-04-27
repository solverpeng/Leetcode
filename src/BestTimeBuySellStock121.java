/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/27 0027
 *      desc  :
 * </pre>
 */
public class BestTimeBuySellStock121 {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int i = maxProfit(prices);
        System.out.println(i);
    }

    public static int maxProfit(int[] prices) {
        int maxCur = 0, maxSofar = 0;
        for (int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur + (prices[i] - prices[i - 1]));
            maxSofar = Math.max(maxCur, maxSofar);
        }
        return maxSofar;
    }
}
