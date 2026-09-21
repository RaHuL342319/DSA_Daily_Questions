class Solution {
    public void helperSubsets(int[] arr, int idx, List<List<Integer>> list, List<Integer> ans){
        if(idx == arr.length){
            list.add(new ArrayList<>(ans));
            return;
        }

        // pick
         // Pick
        ans.add(arr[idx]);
        helperSubsets(arr, idx + 1, list, ans);

        // Backtrack
        ans.remove(ans.size() - 1);
        // skip
        helperSubsets(arr, idx+1, list, ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        helperSubsets(nums, 0, list, ans);
        return list;
    }
}