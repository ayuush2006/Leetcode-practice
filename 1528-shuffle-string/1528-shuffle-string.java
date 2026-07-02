class Solution {
    public String restoreString(String s, int[] brr) {
        int n = s.length();
        char [] arr = new char [n] ;
        for (int i = 0; i<n ; i++){
            int a = brr[i] ;
            arr[a] = s.charAt(i);
        }
return new String (arr) ;// arr ko string me convert 
    }
}