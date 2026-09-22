class Solution {
    public int maxAbsoluteSum(int[] arr) {

        int maxSum = 0;
        int minSum = 0;

        int currentMax = 0;
        int currentMin = 0;

        for (int i = 0; i < arr.length; i++) {

            currentMax = Math.max(0, currentMax + arr[i]);
            currentMin = Math.min(0, currentMin + arr[i]);

            maxSum = Math.max(maxSum, currentMax);
            minSum = Math.min(minSum, currentMin);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }
}