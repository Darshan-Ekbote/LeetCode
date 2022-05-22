class Solution {
    public boolean validTree(int n, int[][] edges) {
        
        
        List<List<Integer> > adj = new ArrayList<>();
        Set <Integer>  seen = new HashSet<>();
        
        
        //create adj listf
        for( int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        
        //fill the list with edges
        for( int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        
        //dfs
        dfs(adj,seen,0);
        
        //all nodes should be visitable and  edges.length == n-1
        return seen.size() == n &&  edges.length == n-1;
            
    }
    
    
    private void dfs(List<List<Integer>> adj, Set<Integer> seen, int cur){
        
        if(seen.contains(cur)){
            return;
        }
        
        seen.add(cur);
        // 0 -> [1]
        // 1 -> [0,2,3,4]
        // 2 -> [1,3]
        // 3 -> [1,2]
        // 4 -> [1]
        // seen -> [0,1,2,3,4]
        for( int i : adj.get(cur)){ //take all the neighbours and iterate over them one by one
            
            dfs(adj,seen,i);
            
        }
        
        
    }
    
    
}