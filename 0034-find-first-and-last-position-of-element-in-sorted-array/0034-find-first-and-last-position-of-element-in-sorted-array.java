class Solution {
    public int[] searchRange(int[] arr, int target) {

        int n = arr.length;
        int low = 0, high = n - 1;
        boolean flag = false;
        int[] ans = {-1, -1};
    // first check element is present
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                flag = true;
                break;
            } 
            else if (arr[mid] > target) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        if (flag== false) return ans;

        // Lower Bound
        low = 0;
        high = n - 1;
        int lb = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                lb = Math.min(lb, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        ans[0] = lb;

        // Upper Bound
        low = 0;
        high = n - 1;
        int ub = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {   
                ub = Math.min(ub, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        ans[1] = ub - 1;   
        return ans;
    }
}