class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> adj = new ArrayList<>();
        //status of all elements is zero
        int[] status = new int[numCourses];
        
        for(int i =0;i<numCourses;i++)
            adj.add(new ArrayList<>());

        for( int i =0;i< prerequisites.length;i++)
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        
        
        for( int i =0;i< numCourses;i++)
                if(isCycle(adj,status,i))
                     return false;
        
        
         return true;
       }
        
    
    
    public boolean isCycle(List<List<Integer>> adj, int status[],int itr){
        
       if( status[itr]==1) return true;
        
       if(status[itr]==2) return false;
        
       status[itr]=1;
        
       for( int i : adj.get(itr))
                    if( isCycle(adj,status,i))
                         return true;
        
        
        status[itr]=2;
        
        return false;

        
    }
}