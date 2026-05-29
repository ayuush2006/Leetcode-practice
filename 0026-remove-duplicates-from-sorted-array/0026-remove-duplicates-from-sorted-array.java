class Solution {
    public int removeDuplicates(int[] arr) {
        int i = 1;
 //Index 0 ka kaam ho gaya.
//Ab agla unique element index 1 par rakhenge.
//arr = [5,5,7]
//Index : 0 1 2
//value : 5 5 7
//5 pehle se index 0 par hai.
//Ab jab 7 milega to use index 1 par rakhenge.
        

        for(int j = 1; j < arr.length; j++) {
            if(arr[j] != arr[j - 1]) {
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }
}