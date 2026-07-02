class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
       char [] arr = new char [n];
       for(int i = 0; i<n ; i++){
        int a = indices[i];
           arr[a]    = s.charAt(i);
       }
       return new  String(arr);
}
}