class Solution {
    public String longestCommonPrefix(String[] arr) {
        int n = arr.length;
        String ans = "";
      for(int i = 0; i < arr[0].length(); i++) {
          for(int j = 1; j < n; j++) {
              if(i >= arr[j].length() || (arr[0].charAt(i) != arr[j].charAt(i))) {
                  return ans;
        }
    }
    ans += arr[0].charAt(i);
}
return ans ;
}
}
