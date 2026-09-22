class Solution {
    public int findMiddleIndex(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int presum = 0;
            int sufsum = 0;

            // left side ka sum
            for (int j = 0; j < i; j++) {
                presum += arr[j];
            }
            // right side ka sum
            for (int j = i + 1; j < n; j++) {
                sufsum += arr[j];
            }
            // middle index mil gaya
            if (presum == sufsum) {
                return i;
            }
        }
        return -1;
    }
}