   // linear search
 //class Solution {
  //   public int search(int[] arr, int target) {
//         int n = arr.length;
//         for (int i = 0 ; i<n ; i++){
//             if (arr[i]== target) 
//             return i;
//         }
//         return -1;
//     }
// }

//binary search
class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)  return mid;
            else if (arr[mid] <= arr[high]) {   // i am in  Right sorted (mid to high everything is sorted) part
                if (target > arr[mid] && target <= arr[high])  low = mid + 1;
                else high = mid - 1;
            }
            else {   // i am in Left sorted array part (low tp mid every thing is sortd)
                if (target >= arr[low] && target < arr[mid])  high = mid - 1;    
                else low = mid + 1;
            }
        }
        return -1;
    }
}
