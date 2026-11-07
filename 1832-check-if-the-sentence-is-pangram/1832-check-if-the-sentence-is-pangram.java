class Solution {
    public boolean checkIfPangram(String sentence) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (sentence.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}