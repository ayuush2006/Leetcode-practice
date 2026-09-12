class Solution {
    public String longestCommonPrefix(String[] arr) {
        int n = arr.length;
        String ans = "";
        Arrays.sort(arr);
        for (int i = 0; i < arr[0].length() ; i++) {
            if (arr[0].charAt(i) != arr[n - 1].charAt(i)) {
                break;
            }
            ans += arr[0].charAt(i);
        }
        return ans;
    }
}