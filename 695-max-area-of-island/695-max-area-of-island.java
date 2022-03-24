class Solution {
    public int maxAreaOfIsland(int[][] grid) {
    
        int r = grid.length;
        int c = grid[0].length;
        
        int maxArea =0;
        
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        for( int i =0;i< r;i++){
            for(int j=0;j<c;j++){
                
                maxArea = Math.max(maxArea, getArea(grid, i,j, visited));
            }
        }
        
        return maxArea;
    }
    
    
    public int getArea( int[][] grid, int r, int c,boolean [][] visited){
     
        
        if(r<0 || r>=grid.length || c<0 || c>= grid[0].length || grid[r][c]==0 || visited[r][c])
            return 0;
        
        visited[r][c]= true;
        
        return (1+ getArea(grid, r+1, c, visited)+ getArea(grid, r-1, c, visited)+ 
                getArea(grid, r, c+1, visited)+ getArea(grid, r, c-1, visited));
        
    }
}