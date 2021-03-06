class Solution {
    int[][] dirs = new int[][]{ {0,1}, {1,0}, {0,-1}, {-1,0} };
    
    public int orangesRotting(int[][] grid) {
        int minutes = 0;
        int freshOranges = 0;
        Queue<int[]> q = new LinkedList<>();
        
        //add rotten orange to the queue
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                int val = grid[i][j];
                if(val == 2){
                    q.add(new int[]{i, j});
                } else if(val == 1) {
                    freshOranges++;
                }
            }
        }
        
        
        while(!q.isEmpty()) {
            int size =q.size();
            while(size>0) {
                
                int[] point = q.poll();  
                for(int[] dir : dirs) {
                    
                    int i = point[0] + dir[0];
                    int j = point[1] + dir[1];
                    //get fresh orange
                    if(isValid(grid, i, j)){
                    //mark is rotten
                      grid[i][j] = 2;
                      freshOranges--;
                    //add it to the queue
                      q.add(new int[]{i, j});
                    } 
                }
                size--;
            }
                minutes++;
        }
        //if all freshOranges cannote be converted to rotten the return -1 else minutes -1 (last rotten orange cannot be used for rotting more oranges hence -1)
        return freshOranges > 0 ? -1 : ( minutes-1>0 ? minutes-1:0);
    }
    
    private boolean isValid(int[][] grid, int i, int j){
        //check boundary conditions and fresh orange presence
        return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length 
            && grid[i][j] == 1;
    }
    
}