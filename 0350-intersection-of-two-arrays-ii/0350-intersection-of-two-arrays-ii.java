class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {

        int n = Math.min(arr1.length, arr2.length);
        int[] matrix = new int[n];
        int k = 0;

        // Traverse arr1
        for (int i = 0; i < arr1.length; i++) {

            // Traverse arr2
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {

                    matrix[k] = arr1[i];
                    k++;

                    // Mark this element as used
                    arr2[j] = -1;

                    break;
                }
            }
        }

        // Final answer array
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = matrix[i];
        }

        return ans;
    }
}