class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length,col=matrix[0].length;
        int s=0,e=row*col-1;
        while(s<=e){
            int mid=(e-s)/2+s;
            if(matrix[mid/col][mid%col]==target) return true;
            else if(matrix[mid/col][mid%col]<target) s=mid+1;
            else e=mid-1;
        }
        return false;
    }
}
