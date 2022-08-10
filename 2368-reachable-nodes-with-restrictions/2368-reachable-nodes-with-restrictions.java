class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        
       List<List<Integer>> adj = new ArrayList<>();
        
       Set<Integer> visited = new HashSet<>();
        Set<Integer> rest = new HashSet<>();
        
         for( int num: restricted) rest.add(num);
       
        for( int i=0;i<n;i++) adj.add( new ArrayList<>());
        
        for( int [] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        dfs(adj, visited,rest,0);
        
        return visited.size();
    }
    
    public void dfs( List<List<Integer>> adj , Set<Integer> visited ,Set<Integer> restricted,int node){
        
        
        // 0 -> 1,4,5
        //1 -> 2,3
        //2->
        //3->
        //4 -> 
        //5 ->
        //6 ->
        
        if(visited.contains(node)||restricted.contains(node) ) return;
        
        //add to visited
        visited.add(node);
        
        //visit every neighbour
        for( int n: adj.get(node)){
            
            dfs(adj, visited,restricted,n);
        }
        
    }
}