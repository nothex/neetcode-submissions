class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=matrix.length*matrix[0].length-1,col=matrix[0].length;
        while(i<=j){
            int mid=(j-i)/2+i;
            if(matrix[mid/col][mid%col]==target) return true;
            else if (matrix[mid/col][mid%col]<target) i=mid+1;
            else j=mid-1;
        }
        return false;
    }
}
