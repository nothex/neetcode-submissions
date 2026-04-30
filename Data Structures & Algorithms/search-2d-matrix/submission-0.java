class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int N=matrix.length;
        int M=matrix[0].length;
        int i=0,j=N*M-1;
        while(i<=j){
        int mid=i+(j-i)/2;
        if(matrix[mid/M][mid%M]==target) return true;
        else if(matrix[mid/M][mid%M]<target) i=mid+1;
        else j=mid-1;
        }
        return false;
    }
}
