class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {

        int n = Math.min(arr1.length, arr2.length);
        int[] matrix = new int[n];
        int k = 0;

        // Traverse in arr1
        for (int i = 0; i < arr1.length; i++) {

            // Traverse in arr2
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {

                    boolean found = false;

                    // Check if already present in matrix
                    for (int x = 0; x < k; x++) {
                        if (matrix[x] == arr1[i]) {
                            found = true;
                            break;
                        }
                    }

                    // Add only if not already present
                    if (!found) {
                        matrix[k] = arr1[i];
                        k++;
                    }

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