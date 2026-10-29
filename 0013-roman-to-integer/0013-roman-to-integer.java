class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int ans = 0;
        int j = n - 1;

        for (j = n - 1; j >= 0; j--) {
            int curr = 0;

            if (s.charAt(j) == 'I') curr = 1;
            else if (s.charAt(j) == 'V') curr = 5;
            else if (s.charAt(j) == 'X') curr = 10;
            else if (s.charAt(j) == 'L') curr = 50;
            else if (s.charAt(j) == 'C') curr = 100;
            else if (s.charAt(j) == 'D') curr = 500;
            else if (s.charAt(j) == 'M') curr = 1000;

            if (j < n - 1) {
                int next = 0;

                if (s.charAt(j + 1) == 'I') next = 1;
                else if (s.charAt(j + 1) == 'V') next = 5;
                else if (s.charAt(j + 1) == 'X') next = 10;
                else if (s.charAt(j + 1) == 'L') next = 50;
                else if (s.charAt(j + 1) == 'C') next = 100;
                else if (s.charAt(j + 1) == 'D') next = 500;
                else if (s.charAt(j + 1) == 'M') next = 1000;

                if (curr < next) ans -= curr;
                else ans += curr;
            }
             else {
                ans += curr;
            }
        }

        return ans;
    }
}