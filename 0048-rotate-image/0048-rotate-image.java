class Solution {
    public void transposeSquareMatrix(int[][] arr){
        for(int i =0; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public void reverseRowsOfMatrix(int[][] arr){
        for(int i =0; i < arr.length; i++){
            int j =0;
            int k = arr[0].length - 1;
            while(j < k){
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                j++;
                k--;
            }
        }
    }
    public void rotate(int[][] matrix) {
        transposeSquareMatrix(matrix);
        reverseRowsOfMatrix(matrix);
    }
}