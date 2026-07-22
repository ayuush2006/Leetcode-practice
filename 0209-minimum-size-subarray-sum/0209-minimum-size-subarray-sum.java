// class Solution {
//     public int minSubArrayLen(int target, int[] arr) {
//         int n = arr.length;
//         int ans = Integer.MAX_VALUE;
//         for (int i = 0; i < n; i++) {
//             int sum = 0;
//             for (int j = i; j < n; j++) {
//                 sum += arr[j];
//                 if (sum >= target) {
//                     ans = Math.min(ans, j - i + 1);
//                 }
//             }
//         }
//         if (ans == Integer.MAX_VALUE)
//             return 0;
//         return ans;
//     }
// }


class Solution {
    public int minSubArrayLen(int target, int[] arr) {

        int n = arr.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        int low = 0;

        for (int high = 0; high < n; high++) {

            sum = sum + arr[high];

            while (sum >= target) {

                min = Math.min(min, high - low + 1);

                sum = sum - arr[low];
                low++;
            }
        }

        if (min == Integer.MAX_VALUE)
            return 0;

        return min;
    }
}