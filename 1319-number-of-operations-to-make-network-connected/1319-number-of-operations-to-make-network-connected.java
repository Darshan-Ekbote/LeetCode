class Solution {
    boolean visited[];
    public int makeConnected(int n, int[][] connections) {
        
        visited = new boolean[n];
        int totalEdges = connections.length;
        int component=0;
        //make adj list
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i =0;i<n;i++)  adj.add( new ArrayList<>());
        
        for( int i =0;i<connections.length;i++){
            adj.get(connections[i][0]).add(connections[i][1]);   
            adj.get(connections[i][1]).add(connections[i][0]);  
        }
        
        //dfs
        
        for( int i=0;i<n;i++){
            //count components
            if(!visited[i]){
                dfs(adj,i,visited);
                component++;
            }
        }
        
        //return after calulations
        
        if(totalEdges<n-1) return -1;
        int resEdges = totalEdges - ((n-1 )-(component-1));
         return (resEdges >= 0) ?component-1 : -1;
        
    }
    
    public void dfs( List<List<Integer>> adj, int i, boolean[] visited){
       
        if(visited[i]) return;
        
        visited[i]=true;
        
        for( int n: adj.get(i))
            dfs(adj,n,visited);
        
    }
}