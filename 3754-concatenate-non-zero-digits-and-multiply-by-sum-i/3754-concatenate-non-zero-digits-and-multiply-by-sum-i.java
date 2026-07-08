class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (n > 0) { // jb tak no khatam na ho jaye tb tak loop chalega 
            int digit = n % 10; // last digit nikal rahe hai
            if (digit != 0) { // last digit 0 na ho tab
                sb.append(digit);
                sum += digit;
            }
            n /= 10;
        }
        sb.reverse();
        if (sb.length() == 0) {
            return 0;
        }
        long x = Long.parseLong(sb.toString()); // sb.toString stringbuilder ko string bana deta hai aur fhir Long.parseLong string ko integer bana deta hai
        return x * sum;
    }
}