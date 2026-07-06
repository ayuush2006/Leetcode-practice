import java.util.*;

class Solution {
    public int totalNumbers(int[] digits) {

        ArrayList<Integer> list = new ArrayList<>();
        int n = digits.length;

        for (int i = 0; i < n; i++) {  // hundred place ke liye 
            for (int j = 0; j < n; j++) { // tenth place ke liye 
                for (int k = 0; k < n; k++) { // ones place ke liye 

                    if (i != j && j != k && i != k) { // saari digit different honi chahiye 

                        if (digits[i] != 0 && digits[k] % 2 == 0) { // ist digit 0 nahi aur last digit 2 se sivisible hona chahiye 

                            int num = digits[i] * 100 + digits[j] * 10 + digits[k];

                            if (!list.contains(num)) {
                                list.add(num);
                            }
                        }
                    }
                }
            }
        }

        return list.size();
    }
}