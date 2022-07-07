class Solution {
    int[][] dirs = new int[][]{ {0,1}, {1,0}, {0,-1}, {-1,0} };
    
    public int orangesRotting(int[][] grid) {
        int minutes = 0;
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        
        //add rotten orange to the queue
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                int val = grid[i][j];
                if(val == 2){
                    q.add(new int[]{i, j});
                } else if(val == 1) {
                    count++;
                }
            }
        }
        
        
        while(!q.isEmpty()) {
            List<int[]> list = new ArrayList();
            
            while(!q.isEmpty()) {
                
                int[] point = q.poll();  
                for(int[] dir : dirs) {
                    
                    int i = point[0] + dir[0];
                    int j = point[1] + dir[1];
                    
                    if(isValid(grid, i, j)){
                      list.add(new int[]{i, j});  
                      grid[i][j] = 2;
                      count--;
                    } 
                }
            }
            
            for(int[] p : list) {
                q.add(p);
            }
            //if(!list.isEmpty()) 
            minutes++;
        }
        return count > 0 ? -1 : ( minutes-1 >0?minutes-1 :0);
    }
    
    private boolean isValid(int[][] grid, int i, int j){
        //check boundary conditions and fresh orange presence
        return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length 
            && grid[i][j] == 1;
    }
    
}