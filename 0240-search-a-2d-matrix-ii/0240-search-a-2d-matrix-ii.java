class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length; // row
        int n = arr[0].length; // column
        int i = 0; // rowIndex
        int j = n - 1; // colIndex
        while(i < m && j >= 0 ){
            if(arr[i][j] > target){
                // go down mtlb rowIndex + 1
                j--;
            }else if(arr[i][j] < target){
                // go left mtlb colIndex - 1
                i++;
            }else{
                return true;
            }
        }
        return false; 
    }
}