class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        int len = nums1.length + nums2.length;

        int target1 = (len - 1) / 2;
        int target2 = len / 2;

        int count = 0;

        int prev = 0;
        int curr = 0;
        
        while(count <= target2){
            prev = curr;
            if (i < nums1.length &&
                (j >= nums2.length || nums1[i] <= nums2[j])) {

                curr = nums1[i++];

            } else {

                curr = nums2[j++];
            }

            count++;
        }
        if(len%2 == 0){
            return (prev+curr)/2.0;
        }
        return curr;
    }
}