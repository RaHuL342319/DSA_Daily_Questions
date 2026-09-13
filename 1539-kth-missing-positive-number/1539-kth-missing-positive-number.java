class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start) /2;
            int totalMissingNumberTillNow = arr[mid] - (mid+1);
            if(totalMissingNumberTillNow >= k){
                //left search space
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start + k; // high+1+k 
    }
}