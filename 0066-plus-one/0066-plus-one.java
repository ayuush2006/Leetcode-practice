class Solution {
    public int[] plusOne(int[] arr) {
        for ( int i = arr.length-1 ; i >= 0 ; i--){
            arr[i]++;
            if(arr[i]<10){
                return arr;
            }
            arr [i] = 0;
        }
        int result[] = new int[arr.length + 1];
        result[0] = 1;
        return result;
    }
}
