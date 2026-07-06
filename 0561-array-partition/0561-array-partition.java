
class Solution {
    public int arrayPairSum(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) { // i+= 2 isliye (1,2) (3,4) (5,6) = hrr pair ka ist element minimum hoga sort karne ke baad aur aur 1st element me +2 hai isliye
            sum += arr[i];
        }
        return sum;
    }
}