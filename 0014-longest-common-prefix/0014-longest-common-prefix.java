class Solution {
    public String longestCommonPrefix(String[] arr) {

        int n = arr.length;
        String ans = "";

        Arrays.sort(arr);

        // first and last string
        char[] first = arr[0].toCharArray();
        char[] last = arr[n - 1].toCharArray();

        // compare
        for (int i = 0; i < first.length && i < last.length; i++) {

            if (first[i] != last[i]) {
                break;
            }

            ans += first[i];
        }

        return ans;
    }
}