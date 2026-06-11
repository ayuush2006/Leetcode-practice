class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;

        for(String word : words) {
            String rev = reverse(word);

            if(set.contains(rev))
                count++;
            else
                set.add(word);
        }

        return count;
    }

    public String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}