import java.util.Arrays;

class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (arr[0] != 0) {
            return 0;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                return arr[i] + 1;
            }
        }
        return n;
    }
}