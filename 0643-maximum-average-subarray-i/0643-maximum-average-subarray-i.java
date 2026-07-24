
class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n = arr.length;
        int low = 0 , high = k - 1;
        int max = Integer.MIN_VALUE;
        int sum = 0 ;
        // sum of window size k
        for (int i = 0 ; i <= high ; i++ ){
            sum += arr[i] ;
        }
        // window silde kb tak krenge
        while (high < n){
            // maximum
            max = Math.max(max, sum);
            low ++ ;
            high ++ ;
            if (high == n){
            break ;
        }
        // main case laga rahe 
        sum = sum - arr[low - 1] + arr[high];
        }
        return (double) max / k; // average nikal rahe 
    }
}