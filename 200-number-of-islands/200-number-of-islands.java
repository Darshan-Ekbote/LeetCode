class Solution {
    
    public void dfs (char[][] grid,int r, int c){
        if(r<0 || c<0|| r>=grid.length||c>=grid[0].length||grid[r][c]=='0'||grid[r][c]=='X')
            return;
        
        //mark as visited
        grid[r][c]='X';
        
        dfs(grid,r+1,c );
        dfs(grid,r-1,c );
        dfs(grid, r,c+1 );
        dfs(grid ,r,c-1 );
    }
    
    
    public int numIslands(char[][] grid) {
          int count=0;
         if (grid == null || grid.length == 0)  
                return 0;
     
        for(int i=0;i<grid.length;i++){
            
            for(int j=0;j<grid[i].length;j++){
                
                if(grid[i][j]=='1' ){
                    
                    dfs(grid,i,j);
                   count++;
                }
            }
        }
      
        
        return count;
        
    }
}