class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        if (nums.length == 0) {
            return new ArrayList<>();
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int item: nums){
            if(max < item) max = item;
            if(min > item) min = item;
            set.add(item);
        }

        for(int i = min; i <= max; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }

    return list;
    }
}