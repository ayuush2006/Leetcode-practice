class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int currsum = 0 , maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            currsum += arr[i];
            maxsum = Math.max(currsum, maxsum);
            if (currsum <0) currsum = 0;
        }
        return maxsum;
    }
    
}