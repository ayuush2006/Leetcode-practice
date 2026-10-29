
// class Solution {
//     public int reverseDegree(String s) {
//         int sum = 0;
//         char[] arr = s.toCharArray();
//         for (int i = 0; i < arr.length; i++) {
//             int value = 'z' - arr[i] + 1;
//             int position = i + 1;
//             sum = sum + (value * position);
//         }
//         return sum;
//     }
// }

class Solution {
    public int reverseDegree(String s) {
        int res = 0;

        for (int i = 1; i <= s.length(); i++) {
            res += (26 - (s.charAt(i - 1) - 'a')) * i;
        }

        return res;
    }
}