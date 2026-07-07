class Solution {
    public int repeatedNTimes(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n ; i++)  {
            int ans = 0;
            for(int j = 0; j < n ; j++){
                if (arr[i] == arr[j]){
                    ans ++;
                }
            }
            if (ans > 1) return arr[i] ;
        }    
        return -1  ;
    }
}