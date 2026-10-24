
class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int i = 0, j = n - 1;

        char[] brr = new char[n];

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }

        for (int k = 0; k < n; k++) {
            brr[k] = s[k];
        }
    }
}













//  class Solution {
//     public void reverseString(char[] s) {
//         int i = 0;
//          int j = s.length - 1;
//          while (i < j) {
//             char temp = s[i];
//              s[i] = s[j];
//              s[j] = temp;
//              i++;
//              j--;
//          }
//      }
//  }

