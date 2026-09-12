class Solution {
    public int lastNegativeNumber(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int possibleAns = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] >= 0){
                end = mid - 1;
            }else{
                possibleAns = mid;
                start = mid+1;
            }
        }
        return possibleAns;
    }
    public int firstPositiveNumber(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int possibleAns = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] <= 0){
                start = mid+1;
            }else{
                possibleAns = mid;
                end = mid - 1;
            }
        }
        return possibleAns;
    }
    public int maximumCount(int[] nums) {
        int negativeCount = lastNegativeNumber(nums) != -1 ? lastNegativeNumber(nums)+1 : 0;
        int positiveCount = firstPositiveNumber(nums) != -1 ? nums.length - firstPositiveNumber(nums): 0;
        return Math.max(negativeCount, positiveCount);
    }
}