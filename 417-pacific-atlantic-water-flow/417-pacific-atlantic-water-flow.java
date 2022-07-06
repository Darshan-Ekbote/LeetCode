class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        int row = heights.length; 
        int col = heights[0].length;
        
        if(row == 0 || col ==0 || heights ==null)  return result;
        
        boolean[][] pacific = new boolean[row][col];
        boolean[][] atlantic = new boolean[row][col];
        
        // top to bottom
        for(int i=0;i<col;i++) {
            //from pacific end 
            dfs(heights, 0, i, heights[0][i], pacific);
            //from atlantic end
            dfs(heights, row-1, i, heights[row-1][i], atlantic);
        }
        
        // left to right
        for(int i=0;i<row;i++) {
            //from pacific end 
            dfs(heights, i, 0, heights[i][0], pacific);
             //from atlantic end
            dfs(heights, i, col-1, heights[i][col-1], atlantic);
        }
        
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                //check if this cell reaches both the oceans
                if(pacific[i][j] && atlantic[i][j]) result.add( Arrays.asList(i,j));
                
            }
        }
        
        return result;
        
    }
    
    private void dfs(int[][] heights, int i, int j, int preheight, boolean[][] ocean) {
        
        if(i<0 || i>= heights.length || j<0 || j>= heights[0].length || preheight > heights[i][j] || ocean[i][j])
            return;
        
        ocean[i][j] = true;
        
        dfs(heights, i+1, j, heights[i][j], ocean);
        dfs(heights, i, j+1, heights[i][j], ocean);
        dfs(heights, i-1, j, heights[i][j], ocean);
        dfs(heights, i, j-1, heights[i][j], ocean);
    }
}