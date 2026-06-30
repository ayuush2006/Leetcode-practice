class Solution {
    public int majorityElement(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        // int count = 1;

        // for (int i = 0; i < n - 1; i++) {
        //     if (arr[i] == arr[i + 1]) {
        //         count++;
        //     } else {
        //         count = 1;
        //     }

        //     if (count > n / 2) {
        //         return arr[i];
        //     }
        // }

        // return arr[0];

       // return arr[n/2]; // method 2
       // method 3
      int freq = 0, ans = 0;

for (int i = 0; i < n; i++) {
    if (freq == 0) {
        ans = arr[i];
    }

    if (ans == arr[i]) {
        freq++;
    } else {
        freq--;
    }
}

return ans;
    }
}