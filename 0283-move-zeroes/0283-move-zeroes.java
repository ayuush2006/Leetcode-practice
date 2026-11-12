// class Solution {
//     public void moveZeroes(int[] arr) {
//         int j = 0; // position for next non-zero element
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
//                 public static void main(String[] args) {

    //     int[] arr = {5, 2, 8, 1, 4, 0};
    //     int n = arr.length;

    //     for (int i = 0; i < n - 1; i++) {

    //         int swap = 0;

    //         for (int j = 0; j < n - 1 - i; j++) {

    //             if (arr[j] < arr[j + 1]) {

    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;

    //                 swap++;
    //             }
    //         }

    //         if (swap == 0) break;
    //     }

    //     for (int ele : arr) {
    //         System.out.print(ele + " ");
    //     }
    // }
//                 j++;
//             }
//         }
//     }
// }

class Solution {
    public void moveZeroes(int[] arr) {
    //    //same size ka ek naya array banayenge
    //     int[] brr = new int[arr.length];
    //     int index = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] != 0) {
    //             brr[index] = arr[i];
    //             index++;
    //         }
    //     }

    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = brr[i];
     //   }

     int n = arr.length;
     for(int i = 0 ; i<n-1; i++){
        for(int j = 0; j<n-1-i; j++){
            if(arr[j]==0){
                int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
            }
        }
     }
    }
}



