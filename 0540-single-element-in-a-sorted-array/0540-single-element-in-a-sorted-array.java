class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if(n==1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];

        // binary search
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]) return arr[mid];
            // pehla  and dusra  find kro
            int pehla = mid, dusra = mid;
            if(arr[mid-1] == arr[mid]){
                pehla = mid - 1;
            }else{
                dusra = mid + 1;
            }

            // left and right count
            int leftCount = pehla - start;
            int rightCount = end - dusra;

            // agar left even hai to start = dusra + 1
            if(leftCount %2 == 0){
                start = dusra +1;
            }else{
                end = pehla - 1;
            }

        }
        return - 1;
    }
}