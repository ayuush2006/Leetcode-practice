import java.util.*;

class Solution {
    public int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = {-1, -1};

        for (int i = 0; i < arr.length; i++) {

            int rem = target - arr[i];

            if (map.containsKey(rem)) {
                ans[0] = i;
                ans[1] = map.get(rem);
                break;
            }

            map.put(arr[i], i);
        }

        return ans;
    }
}