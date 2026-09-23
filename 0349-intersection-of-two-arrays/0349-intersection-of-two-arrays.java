class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        // put into set
        for(int num : nums1){
            set.add(num);
        }

        // check from nums2
        for(int num: nums2){
            if(set.contains(num)) ans.add(num);
        }
        int[] res = new int[ans.size()];
        int i =0;
        for(int num: ans){
            res[i++] = num;
        }
        return res;
    }
}