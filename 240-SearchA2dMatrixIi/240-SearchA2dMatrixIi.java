// Last updated: 2/25/2026, 9:09:57 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length-1;
        int col=0;
        while(row>=0 && matrix[0].length>col){
            if(matrix[row][col]==target){
                return true;
            }
            if(matrix[row][col]>target){
                row--;
            }
            else{
                col++;
            }
        }
        return false;
}}