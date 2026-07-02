class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int a = 0;
        int ans =  0 ; // return karane ke liye 
        for ( int i =0 ; i<n  ; i++){
         if (s.charAt(i)== '(') {
            ans++;
        a =  Math.max(a , ans);
             
         }
         if (s.charAt(i)== ')') ans--;
        }
        return a;
    }
}