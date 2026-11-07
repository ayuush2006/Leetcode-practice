class Solution {
    public boolean isMonotonic(int[] arr) {

        int n = arr.length;
        boolean inc = true;
        boolean dec = true;

        // Increasing check
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                inc = false;
                break;
            }
        }

        // Decreasing check
        for (int j = 1; j < n; j++) {
            if (arr[j - 1] < arr[j]) {
                dec = false;
                break;
            }
        }

        return inc || dec;
    }
}