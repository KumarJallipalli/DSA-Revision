/*
 *                              Lectur - 10
*/


/*
 *  Buy & Sell Stock -> Leetcode 121
 *  ----------------
 *  You are given an array `prices` where `prices[i]` is the price of a given stock on the `ith` day.
    You want to maximize your profit by choosing a **single day** to buy one stock and choosing a **different day in the future** to sell that stock.
    Return *the maximum profit you can achieve from this transaction*. If you cannot achieve any profit, return `0`.
*/

/*
 *  `profit = SP - BP;`
        - To get max profit → SP should be maximum && BP should be minimum
        - To get the min BP, we will compare the BP with each day price & update
        - Instaed of updating SP for maximum, we will update profit using another variable maxProfit
*/

public class BuySellStock {
    public static void main(String[] args) {
        int prices[] = { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println(buySellStock(prices));
    }

    public static int buySellStock (int[] arr) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Actual Code
        for (int i=0; i<arr.length; i++) {
            // Keeping/updating the buy price to minimum
            buyPrice = Math.min(arr[i], buyPrice);

            int profit = arr[i] - buyPrice;

            // updating the profit
            maxProfit = Math.max(maxProfit, profit);


            // Above code is same as below code
            if (buyPrice > arr[i]) {
                buyPrice = arr[i];
            }
            else {
                profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}


