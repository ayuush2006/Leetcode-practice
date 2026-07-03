class Solution {
    public String mergeAlternately(String word1, String word2) {

        String ans = "";

        int m = word1.length();
        int n = word2.length();
        int min;

        if (m < n) {
            min = m;
        } else {
            min = n;
        }

        for (int i = 0; i < min; i++) {
            ans += word1.charAt(i);
            ans += word2.charAt(i);
        }

        for (int i = min; i < m; i++) {
            ans += word1.charAt(i);
        }

        for (int i = min; i < n; i++) {
            ans += word2.charAt(i);
        }

        return ans;
    }
}