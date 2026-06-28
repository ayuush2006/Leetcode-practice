class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length ;
       int  NoofZeroes = 0  , NoofOnes = 0;
       for (int i =0 ; i<arr.length ; i++){
        if (arr[i]== 0) NoofZeroes ++;
         if (arr[i]== 1)  NoofOnes ++;
       }
        for (int i =0 ; i<arr.length ; i++){
            if(i<NoofZeroes) arr[i] = 0;
            else if(i<NoofZeroes + NoofOnes ) arr[i] = 1;
            else arr[i] = 2;
    }
}
}