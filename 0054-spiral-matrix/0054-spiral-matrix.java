class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        int m = arr.length; // row
        int n = arr[0].length; //column
        int firstRow = 0, lastRow = m - 1;
        int firstCol = 0, lastCol = n - 1;
        
        while(firstRow <= lastRow && firstCol <= lastCol){
            // first row print kro left to right (fc to lc)
            for(int j = firstCol; j <= lastCol; j++){
                ans.add(arr[firstRow][j]);
            }
            firstRow++;
            if(firstRow> lastRow || firstCol > lastCol) break;
            
            // down jana hai, last col print kro up to down (fr to lr)
            for(int i = firstRow; i <= lastRow; i++){
                ans.add(arr[i][lastCol]);
            }
            lastCol--;
            if(firstRow> lastRow || firstCol > lastCol) break;
            
            
            // last row print kro right to left (lc to fc)
            for(int j = lastCol; j >= firstCol; j--){
                ans.add(arr[lastRow][j]);
            }
            lastRow--;
            if(firstRow> lastRow || firstCol > lastCol) break;
            
            
           // first col print kro down to up (lr to fr)
            for(int i = lastRow; i >= firstRow; i--){
                ans.add(arr[i][firstCol]);
            }
            firstCol++;
            if(firstRow> lastRow || firstCol > lastCol) break;
            
        }
        return ans;
    }
}