class Solution {
      public void rotate(int[] arr, int k)  {
        int n = arr.length;
        int[] brr = new int[arr.length];
        for(int i =0 ; i<arr.length; i++){
            brr[(i+k)% n] = arr[i];
        }
        for(int i = 0; i<n ; i++){
            arr[i] = brr[i];
        }
    }
}
























//         while (start < end) { 
//             //SWAP FIRST TO LAST
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }

   // public void rotate(int[] arr, int k) {
//         int n = arr.length;
//         k = k % n; 
//         reverse(arr, 0, n - 1);
//         reverse(arr, 0, k - 1);
//         reverse(arr, k, n - 1);
//     }
// }