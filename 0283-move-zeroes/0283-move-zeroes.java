// class Solution {
//     public void moveZeroes(int[] arr) {
//         int j = 0; // position for next non-zero element
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//                 j++;
//             }
//         }
//     }
// }

class Solution {
    public void moveZeroes(int[] arr) {
       //same size ka ek naya array banayenge
        int[] brr = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                brr[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = brr[i];
        }
    }
}



