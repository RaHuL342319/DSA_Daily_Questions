class Solution {
    public int GCD(int a, int b){
        if(a== 0) return b;
        return GCD(b%a, a);
    }
    public int findGCD(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        return GCD(min,max);
    }
}