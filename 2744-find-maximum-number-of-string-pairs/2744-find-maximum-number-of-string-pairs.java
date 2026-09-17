class Solution {
    public int maximumNumberOfStringPairs(String[] arr) {
        int count = 0;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            String rev = reverse(arr[i]);
            // reverse already present hai?
            if (set.contains(rev)) {
                count++;
            }
            // current string ko set me daal do
            set.add(arr[i]);
        }
        return count;
    }

    public String reverse(String s) {
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ans = ans + s.charAt(i);
        }
        return ans;
    }
}

//class Solution {
    //public int maximumNumberOfStringPairs(String[] words) {
        //brute
       /* int cnt=0;
        for(int i=0;i<words.length;i++){
            String s1=words[i];
            for(int j=i+1;j<words.length;j++){
                String s2=words[j];
                if(s1.charAt(0)==s2.charAt(1) && s1.charAt(1)==s2.charAt(0)){
                    cnt++;
                }
            }
        }
            return cnt;
        }
    }*/

   