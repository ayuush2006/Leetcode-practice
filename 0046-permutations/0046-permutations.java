class Solution {

    public List<List<Integer>> permute(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();

        generate(arr, new ArrayList<>(), ans);

        return ans;
    }

    public void generate(int[] arr, List<Integer> temp,
                         List<List<Integer>> ans) {

        if (temp.size() == arr.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (temp.contains(arr[i]))
                continue;

            temp.add(arr[i]);

            generate(arr, temp, ans);

            temp.remove(temp.size() - 1);
        }
    }
}