class Solution {
    boolean[] visited ;
    public int findCircleNum(int[][] isConnected) {
        
        int n =isConnected.length;
        int count=0;
      visited= new boolean[n];
        
        for(int i=0;i<n;i++){
           if(!visited[i]) {
               dfs(isConnected, i,visited);
                count++;
           }
        }
       return count;
    }
    
    
    public void dfs(int[][] graph,int node,boolean[] visited){
        
        if(visited[node]) return;
        
        //mark it visited
        visited[node]=true;
        
        //traverse the connections of this node
            for(int i=0;i<graph[node].length;i++){
                if(graph[node][i]==1) dfs(graph,i,visited);
            }
        
    }
}