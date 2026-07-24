class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {

        int n = arr.length;

        int low = 0;
        int high = k - 1;

        int sum = 0;
        int count = 0;

        // First window ka sum
        for (int i = 0; i <= high; i++) {
            sum += arr[i];
        }

        // Pehli window check karo
        if (sum >= t * k) {
            count++;
        }

        // Window slide karo
        while (high < n) {

            low++;
            high++;

            if (high == n) {
                break;
            }

            // Window update
            sum = sum - arr[low - 1] + arr[high];

            // Current window check
            if (sum >= t * k) {
                count++;
            }
        }

        return count;
    }
}