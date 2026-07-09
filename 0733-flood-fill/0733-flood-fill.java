class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orginalColor=image[sr][sc];
        if(orginalColor==color){
            return image;

        }
        dfs(image,sr,sc,orginalColor,color);

        return image;
        
    }
        public static void dfs(int[][] image,int row,int col,int orginalColor,int color){
            if(row<0 || row>=image.length || col<0 || col>=image[0].length){
                return;
            }
            if(image[row][col]!=orginalColor){
                return;
            }

            image[row][col]=color;

            dfs(image,row-1,col,orginalColor,color);
            dfs(image,row+1,col,orginalColor,color);

            dfs(image,row,col-1,orginalColor,color);

            dfs(image,row,col+1,orginalColor,color);

        }
}