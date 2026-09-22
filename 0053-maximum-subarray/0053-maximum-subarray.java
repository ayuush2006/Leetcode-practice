class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
         int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}


// class Solution {
//     public int maxSubArray(int[] arr) {
//         int maxSum = arr[0];

//         for (int i = 0; i < arr.length; i++) {
//             int currentSum = 0;

//             for (int j = i; j < arr.length; j++) {
//                 currentSum += arr[j];
//                 maxSum = Math.max(maxSum, currentSum);
//             }
//         }

//         return maxSum;
//     }
// }










