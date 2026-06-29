// BRUTE FORCE APPROACH (Time limit exceed )
// class Solution {
//     public int maxProfit(int[] prices) {

//         int maxProfit = 0;
//         int n = prices.length;

//         for (int i = 0; i < n - 1; i++) {

//             for (int j = i + 1; j < n; j++) {

//                 int profit = prices[j] - prices[i];

//                 maxProfit = Math.max(maxProfit, profit);
//             }
//         }

//         return maxProfit;
//     }
// }

// OPTIMAL SOLUTION
class Solution {
    public int maxProfit(int[] prices) {

        int mini = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            int profit = prices[i] - mini;

            maxProfit = Math.max(maxProfit, profit);

            mini = Math.min(mini, prices[i]);
        }

        return maxProfit;
    }
}