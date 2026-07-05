import java.util.Arrays;

class Solution {
    public int missingNumber(int[] arr) {

        Arrays.sort(arr);

        int n = arr.length;

        // Agar 0 missing hai
        if (arr[0] != 0) {
            return 0;
        }

        // Consecutive numbers check karo
        for (int i = 0; i < n - 1; i++) {

            if (arr[i + 1] - arr[i] != 1) {
                return arr[i] + 1;
            }
        }

        // Agar last number missing hai
        return n;
    }
}