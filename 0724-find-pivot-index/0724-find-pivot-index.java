// class Solution {
//     public int pivotIndex(int[] arr) {
//         int n = arr.length;
//         for (int i =0 ; i<n ; i++){
//             int leftsum = 0 , rightsum = 0;
//             for (int j =0 ; j<i ; j++){
//                 leftsum += arr[j];
//             }
//             for (int j = i+1; j<n ; j++){
//                 rightsum += arr[j];
//             }
//             if (leftsum == rightsum) return i;
//         }
//         return -1;
//     }
// }

    class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
        // Prefix Sum
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        // Check Pivot
        for (int i = 0; i < n; i++) {
            int leftsum = 0;
            if (i > 0)
                leftsum = arr[i - 1];
            int rightsum = arr[n - 1] - arr[i];
            if (leftsum == rightsum)
                return i;
        }
        return -1;
    }
}