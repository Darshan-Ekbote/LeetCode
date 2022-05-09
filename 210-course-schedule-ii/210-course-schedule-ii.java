public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //create adj list
        List<List<Integer>> adj = new ArrayList<>();
        List<Integer> res = new ArrayList<Integer>();
        int[] visited = new int[numCourses];
        int[] result = new int[numCourses];
        
        //create adj list -> empty 
        for(int i=0;i< numCourses;i++)
            adj.add(new ArrayList<Integer>());
           
         //add values to the adj list
        for( int i=0;i<prerequisites.length;i++)
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);

        
        //iterate over the numCourses to see if there is any cycle
        for( int i=0;i<numCourses;i++)
            if(isCycle(res,adj,visited,i)) return new int[0];
        
       
        //just add the courses in reverse order to the resulting list
        for( int i = 0;i <numCourses;i++)
            result[i]=res.get(numCourses-i-1);
        
        
        return result;
    }

    
    private boolean isCycle(List<Integer> res, List<List<Integer>> adj, int[] visited, int i){

        if(visited[i]==1) return true;
        else if(visited[i]==2) return false;
        
        
        visited[i]=1;
        
        // 0 -> [1,2]
        // 1-> [3 ]
        // 2 -> [3]
        // 3 -> []
        
        for( int j : adj.get(i)){
            
            if(isCycle(res,adj,visited,j)) return true;
        }
        
        //completed visiting
        visited[i]=2;
        res.add(i); // [3,1,2,0]
        return false;
    }
}
 