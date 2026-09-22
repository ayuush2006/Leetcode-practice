class Solution {
    public int[] runningSum(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n];
        pre[0] = arr[0];
        for (int i =1 ; i<n ; i++){
            pre[i] = arr[i] + pre[i-1];
        }
        return pre ;
    }
}

// class Solution {
//         public int[] runningSum(int[] arr) {
//             int n= arr.length;
//             for (int i = 1; i<n ; i++){
//                 arr[i] += arr[i-1];
//                 }
//          return arr;
//     }
//         }