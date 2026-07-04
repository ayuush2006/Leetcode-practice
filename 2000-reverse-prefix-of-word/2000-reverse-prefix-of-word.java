class Solution {
    public String reversePrefix(String word, char ch) {

        int n = word.length();
        String ans = "";

        for (int i = 0; i < n; i++) {

            if (word.charAt(i) == ch) {

                // Reverse prefix
                for (int j = i; j >= 0; j--) {
                    ans += word.charAt(j);
                }

                // Remaining characters
                for (int k = i + 1; k < n; k++) {
                    ans += word.charAt(k);
                }

                return ans;
            }
        }

        // ch nahi mila
        return word;
    }
}