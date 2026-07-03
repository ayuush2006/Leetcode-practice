// class Solution {
//     public String mergeAlternately(String word1, String word2) {

//         String ans = "";

//         int m = word1.length();
//         int n = word2.length();
//         int min;

//         if (m < n) {
//             min = m;
//         } else {
//             min = n;
//         }

//         for (int i = 0; i < min; i++) {
//             ans += word1.charAt(i);
//             ans += word2.charAt(i);
//         }

//         for (int i = min; i < m; i++) {
//             ans += word1.charAt(i);
//         }

//         for (int i = min; i < n; i++) {
//             ans += word2.charAt(i);
//         }

//         return ans;
//     }
// }


class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j= 0;
        while(i<word1.length() || j<word2.length()){
            if(i<word1.length()){
                sb.append(word1.charAt(i));
                i++;
            }
            if(j<word2.length()){
                sb.append(word2.charAt(j));
                j++;
            }
        }
        return sb.toString();
    }
}