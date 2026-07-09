class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int open = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (open > 0) {
                    ans += "(";
                }
                open++;
            } else {
                open--;
                if (open > 0) {
                    ans += ")";
                }
            }
        }
        return ans;
    }
}