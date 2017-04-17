/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/17 0017
 *      desc  :
 * </pre>
 */
public class BestTimeToBuySellStockII122 {
    public static void main(String[] args) {

    }

    public static int maxProfit(int[] prices) {
        int mapProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i + 1] > prices[i]) {
                mapProfit += prices[i + 1] - prices[i];
            }
        }

        return mapProfit;
    }
}
