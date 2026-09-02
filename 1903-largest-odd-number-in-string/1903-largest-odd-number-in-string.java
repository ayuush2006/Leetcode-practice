class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        for(int i = n - 1; i >= 0; i--){  //Largest odd substring” = right se odd digit.
            if ((num.charAt(i) - '0') % 2 != 0) {   //charAt(i) character deta hai. Digit mein convert karo: (num.charAt(i) - '0') % 2
             return num.substring(0, i + 1);
        }
        }
        return "";
    }
}