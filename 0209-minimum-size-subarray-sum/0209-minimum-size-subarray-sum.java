class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        // Step 1: Initialization
        int low = 0;
        int high = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        // Step 2: Window ko expand karo
        while (high < nums.length) {

            sum += nums[high];

            // Step 3: Agar condition satisfy ho gayi
            while (sum >= target) {

                // Current window ka answer check karo
                min = Math.min(min, high - low + 1);

                // Window ko shrink karo
                sum -= nums[low];
                low++;
            }

            // Step 4: Right pointer ko aage badhao
            high++;
        }

        // Step 5: Agar answer nahi mila
        if (min == Integer.MAX_VALUE)
            return 0;

        return min;
    }
}