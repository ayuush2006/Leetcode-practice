class Solution {
    public int removeDuplicates(int[] arr) {

        // Pehla element hamesha unique hota hai
        int i = 1;

        // j array ko traverse karega
        for(int j = 1; j < arr.length; j++) {

            // Agar current element previous se different hai
            if(arr[j] != arr[j - 1]) {

                // Unique element ko next position par store karo
                arr[i] = arr[j];

                // Next unique element ke liye position badhao
                i++;
            }
        }

        // i = total unique elements
        return i;
    }
}