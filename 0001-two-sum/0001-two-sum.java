class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        for ( int i =0; i<n; i++){
            for(int j = i+1 ;j<n; j++){
                if (arr[i]+ arr[j]== target) {
                    int [] ans = new int [2];
                    ans [0]= i;
                    ans [1]= j;
                    return ans;
                }
            }
        }
        return new int [2];
    } 
    
}