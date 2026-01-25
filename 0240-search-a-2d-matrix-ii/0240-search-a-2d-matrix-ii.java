class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return binarySearch(matrix,target);
        
        
    }
    static boolean binarySearch(int[][]matrix,int target){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0 ){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }





        // int rows=matrix.length;
        // int cols=matrix[0].length;
        // int start=0;
        // int end=rows*cols-1;
        // while(start<=end){
        //     int mid=start+(end-start)/2;
        //     int row=mid/cols;
        //     int col=mid%cols;
        //     if(matrix[row][col]==target){
        //         return true;
        //     }
        //     else if(matrix[row][col]<target){
        //         start=mid+1;
        //     }
        //     else{
        //         end=mid-1;
        //     }
        // }
        return false;
    }
}