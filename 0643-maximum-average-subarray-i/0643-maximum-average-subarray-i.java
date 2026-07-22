
class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        int sum = 0;

        // Step 1: First window ka sum nikalo
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Step 2: Pehli window ko answer maan lo
        int maxSum = sum;

        // Step 3: Window ke pointers set karo
        int low = 0;
        int high = k;

        // Step 4: Window ko slide karo
        while (high < n) {

            // Left wala element hatao
            sum -= nums[low];
            low++;

            // Right wala element add karo
            sum += nums[high];
            high++;

            // Maximum sum update karo
            maxSum = Math.max(maxSum, sum);
        }

        // Step 5: Average return karo
        return (double) maxSum / k;
    }
}