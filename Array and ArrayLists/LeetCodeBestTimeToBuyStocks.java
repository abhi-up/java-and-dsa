// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
// 121. Best Time to Buy and Sell Stock

public class LeetCodeBestTimeToBuyStocks {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        System.out.println(maxProfit(prices));
    }

    /**
     * @param prices prices of stocks on each day (non-decreasing order)
     * @return maximum profit that can be made from buying and selling stock
     */
    public static int maxProfit(int[] prices) {
        // left = buy, right = sell
        int left = 0;
        int right = 1;
        int maxProfit = 0;

        // iterate through days until right pointer reaches end of input array
        while (right < prices.length) {
            // if buying price is less than selling price, we can make a profit
            if (prices[left] < prices[right]) {
                // calculate profit and update maximum profit if necessary
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);

                // if buying price is greater than or equal to selling price,
                // we should buy the stock on the next day
            } else {
                left = right;
            }

            // move right pointer to next day
            right++;
        }

        return maxProfit;
    }

}