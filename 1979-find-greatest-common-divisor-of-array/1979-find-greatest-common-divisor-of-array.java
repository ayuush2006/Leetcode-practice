class Solution {

    public int findGCD(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        return gcd(min, max);
    }

    public int gcd(int a, int b) {

        if (b % a == 0)
            return a;

        return gcd(b % a, a);
    }
}