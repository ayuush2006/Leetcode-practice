import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele : arr) {
            if (map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            } else {
                map.put(ele, 1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 100; i <= 998; i += 2) {

            int x = i;

            int c = x % 10;
            x /= 10;

            int b = x % 10;
            x /= 10;

            int a = x;

            HashMap<Integer, Integer> temp = new HashMap<>(map);

            if (temp.containsKey(a)) {

                int aFreq = temp.get(a);

                if (aFreq == 1)
                    temp.remove(a);
                else
                    temp.put(a, aFreq - 1);

                if (temp.containsKey(b)) {

                    int bFreq = temp.get(b);

                    if (bFreq == 1)
                        temp.remove(b);
                    else
                        temp.put(b, bFreq - 1);

                    if (temp.containsKey(c)) {
                        ans.add(i);
                    }
                }
            }
        }

        int[] ans2 = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            ans2[i] = ans.get(i);
        }

        return ans2;
    }
}