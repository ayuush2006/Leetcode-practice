class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        int ans = -1;
        for(int i = 0 ; i<=n-3 ;i++ ){
         if(num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)){
            int digit = num.charAt(i) - '0';
              if (digit > ans) {
                    ans = digit;
               }

            }
        }
        if(ans == -1){
            return "";
        }
        return "" + ans + ans + ans;
    }
}