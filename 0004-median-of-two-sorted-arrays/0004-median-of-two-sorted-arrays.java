import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m + n];

        int k = 0;
        for (int i = 0; i < m; i++) {
            arr[k] = nums1[i];
            k++;
        }
        for (int i = 0; i < n; i++) {
            arr[k] = nums2[i];
            k++;
        }

        Arrays.sort(arr);

        int len = arr.length;

        if (len % 2 == 0) {
            return (arr[len / 2 - 1] + arr[len / 2]) / 2.0;
        } 
        else {
            return arr[len / 2];
        }
    }
}