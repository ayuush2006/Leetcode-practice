
class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n = arr.length;
        int low = 0 , high = k - 1;
        int max = Integer.MIN_VALUE;
        int sum = 0 ;
        for (int i = 0 ; i <= high ; i++ ){
            sum += arr[i] ;
        }
        while (high < n){
            max = Math.max(max, sum);
            low ++ ;
            high ++ ;
            if (high == n){
            break ;
        }
        sum = sum - arr[low - 1] + arr[high];
        }
        return (double) max / k;
    }
}