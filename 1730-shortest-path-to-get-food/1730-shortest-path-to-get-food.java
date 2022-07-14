class Solution {
     int dir[][] = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    
    public int getFood(char[][] grid) {
        
        if(grid.length==0) return -1;
        
        int r=grid.length;
        int c= grid[0].length;
        boolean visited[][] = new boolean[r][c];
        Queue<int[]> q = new LinkedList<>();
        
        //add starting position 
        for( int i=0;i<grid.length;i++)
            for( int j=0;j<grid[i].length;j++)
                if(grid[i][j]=='*')
                    q.add(new int[]{i,j});
        
        int steps=0;
        
        while(!q.isEmpty()){
            
            int size = q.size();
             for( int i=0;i<size;i++){
                 
                 //get the starting point here
                 int [] xy = q.poll();
                 int x= xy[0];
                 int y= xy[1];
                 
                 //food cell found
                         if(grid[x][y]=='#')
                            return steps;
                 
                 //traverse all direction from this point 
                 for( int [] d : dir){
                     int newX = x+d[0];
                     int newY = y+d[1];
                     if(newX>=0 && newX<r&& newY<c && newY>=0 && !visited[newX][newY] && grid[newX][newY]!='X'){
                         visited[newX][newY] = true;
                         q.add(new int[]{newX,newY});
                         
                         
                     }
                     
                 }
                 
             }
            steps++;
            
        }
        
        return -1;
    }
}