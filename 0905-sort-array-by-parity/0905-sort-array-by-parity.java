class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int n = arr.length;
        int[] brr = new int[n];
        int idx = 0;
         for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                brr[idx] = arr[i];
                idx++;
            }
        }
         // Fir odd numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                brr[idx] = arr[i];
                idx++;
            }
        }
        return brr ;
    }
}