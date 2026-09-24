class Solution {
    public int inversion(int[] a, int[] b){
        int i = 0, j = 0;
        int count = 0;
        while(i < a.length && j < b.length){
            if((long) a[i] > 2L * b[j]){
                count += a.length - i;
                j++;
            }else{
                i++;
            }
        }
        return count;
    }
     public void merge(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;
        int inversion = 0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                c[k++] = a[i++];
            }else{
                c[k++] = b[j++];
            }
        }
        // if anything remaining in a or b
        for(int l = i; l < a.length; l++){
            c[k++] = a[l];
        }
        for(int l = j; l < b.length; l++){
            c[k++] = b[l];
        }
    }
    public int mergeSort(int[] arr){
        int n = arr.length;
        int inversion = 0;
        if(n<=1) return 0;
        // divide array into 2 array
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        
        // copy kro elements
        int k = 0;
        for(int i = 0; i < a.length; i++){
            a[i] = arr[k++];
        }
        for(int i =0; i < b.length; i++){
            b[i] = arr[k++];
        }
        
        // magic pe believe kro

        // Count reverse pairs inside left half
        inversion += mergeSort(a);

        // Count reverse pairs inside right half
        inversion += mergeSort(b);

        // Count reverse pairs across left and right
        inversion += inversion(a, b);

        // Merge them
        merge(a, b, arr);

        return inversion;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums);
    }
}