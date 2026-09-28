class Solution {
    public void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        // cyclic sort 
        int i = 0;
        while(i < arr.length){
            if(i == arr[i] - 1 || arr[i] == arr[arr[i] - 1]) i++;
            else swap(arr, i , arr[i] - 1);
        }

        // result time
        for(i = 0; i < arr.length; i++){
            if(i != arr[i]-1) ans.add(i+1);
        }
        return ans;
    }
}