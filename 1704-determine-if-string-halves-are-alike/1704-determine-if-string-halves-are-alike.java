class Solution {
    public boolean halvesAreAlike(String s) {

        int first = 0;
        int second = 0;

        int n = s.length();

        for (int i = 0; i < n / 2; i++) {

            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                first++;
            }
        }

        for (int i = n / 2; i < n; i++) {

            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                second++;
            }
        }

        if (first == second) {
            return true;
        }

        return false;
    }
}