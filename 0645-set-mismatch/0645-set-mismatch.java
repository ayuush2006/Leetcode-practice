class Solution {
    public int[] findErrorNums(int[] arr) {
        int n = arr.length;
        long sum = 0;
        long squaresum = 0;
        for (int i = 0 ; i<n ; i++){
             // given array aur uske square ka sum  nikal lenge 
            sum = sum + arr[i];
            squaresum += (long) arr[i] * arr[i];
        }
        // orginal sum hai formulae ke through
       long actualsum = (long) n * (n + 1) / 2;
       long actualsquaresum = (long) n * (n + 1) * (2 * n + 1) / 6;

       // array ka sum aur actual sum aur uske square ka difference nikalenge 
        long difference = sum - actualsum;
        long squaredifference = squaresum - actualsquaresum;

// a^2 - b^2 = (a+b)(a-b) 
// (a+b)  = a^2-b^2 / (a-b)
    long add = squaredifference / difference;

    int repeating = (int)((difference + add) / 2);
    int missing = (int)(add - repeating);

return new int[]{repeating, missing};

}   
}