// class Solution {
//     public int removeElement(int[] arr, int val) {
//         int n = arr.length;
//         int i = 0;
//         for (int j = 0; j < n; j++) {
//             if (arr[j] != val) {
//                 arr[i] = arr[j];
//                 i++;
//             }
//         }
//         return i;
//     }
// } 


class Solution {
    public int removeElement(int[] arr, int val) {
        int n = arr.length;
        int[] brr = new int[n];
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] != val) {
                brr[i] = arr[j];
                i++;
            }
        }
        // brr ke elements wapas arr mein daal do
        for (int j = 0; j < i; j++) {
            arr[j] = brr[j];
        }
        return i;
    }
}