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
    public void moveZeroes(int[] nums) {

        int[] newArr = new int[nums.length];

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                newArr[index] = nums[i];
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = newArr[i];
        }
    }
}