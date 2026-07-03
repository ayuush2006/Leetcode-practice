class Solution {
    public String interpret(String command) {

        int n = command.length();
        String ans = "";

        for (int i = 0; i < n; i++) {

            if (command.charAt(i) == 'G') {
                ans += "G";
            }

            else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                ans += "o";
                i++;
            }

            else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                ans += "al";
                i += 3;
            }
        }

        return ans;
    }
}