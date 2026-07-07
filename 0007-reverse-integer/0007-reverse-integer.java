class Solution {
    public int reverse(int x) {

        char[] arr = String.valueOf(Math.abs((long)x)).toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        String s = new String(arr);

        long ans = Long.parseLong(s);

        if (x < 0) {
            ans = -ans;
        }

        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) ans;
    }
}