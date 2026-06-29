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
    public int maxProfit(int[] arr) {

        int mini = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {

            int profit = arr[i] - mini;

            maxProfit = Math.max(maxProfit, profit);

            mini = Math.min(mini, arr[i]);
        }

        return maxProfit;
    }
}