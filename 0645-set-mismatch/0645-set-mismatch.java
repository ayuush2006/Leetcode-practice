class Solution {
    public int[] findErrorNums(int[] arr) {
        int n = arr.length;
        long sum = 0;
        long squaresum = 0;
        for (int i = 0 ; i<n ; i++){
            sum = sum + arr[i];
            squaresum += (long) arr[i] * arr[i];
        }
      long actualsum = (long) n * (n + 1) / 2;
long actualsquaresum = (long) n * (n + 1) * (2 * n + 1) / 6;

long difference = sum - actualsum;
long squaredifference = squaresum - actualsquaresum;

long add = squaredifference / difference;

int repeating = (int)((difference + add) / 2);
int missing = (int)(add - repeating);

return new int[]{repeating, missing};

}   
}