// class Solution {
//     public void sortColors(int[] arr) {
//         int n = arr.length ;
//        int  NoofZeroes = 0  , NoofOnes = 0;
//        for (int i =0 ; i<arr.length ; i++){
//         if (arr[i]== 0) NoofZeroes ++;
//          if (arr[i]== 1)  NoofOnes ++;
//        }
//         for (int i =0 ; i<arr.length ; i++){
//             if(i<NoofZeroes) arr[i] = 0;
//             else if(i<NoofZeroes + NoofOnes ) arr[i] = 1;
//             else arr[i] = 2;
//         }   
//     }
// }
class Solution {
    public void sortColors(int[] arr) {

        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            }

            else if (arr[mid] == 1) {
                mid++;
            }

            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }
}
//public void swap (int[]arr , int low ,  int mid,int  high){

//}