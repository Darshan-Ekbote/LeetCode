class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        List<List<Integer>> adj = new ArrayList<>();
        boolean visited[]= new boolean[n];
        
        for( int i =0;i<n;i++) adj.add(new ArrayList<>());
        
        for( int i=0;i<edges.length;i++){
             adj.get(edges[i][0]).add(edges[i][1]);
             adj.get(edges[i][1]).add(edges[i][0]);
        }
           
        return dfs(adj,visited,source,destination);
                                            
     
    }

  
 
                                             public boolean dfs(List<List<Integer>> adj,boolean[] visited,int source,int destination){
                                             
                                                 if(source==destination) return true;
                                                 
                                                 /*
                                                 0 -> [1,2]
                                                 1 -> [0,2]
                                                 2 -> [0,1]
                                                 */
                                                 for( int n:adj.get(source)){
                                                     if(!visited[n]){
                                                         visited[n]=true;
                                                         if(dfs(adj,visited,n,destination)) return true;
                                                     }
                                                 }
                                                 
                                                 return false;
                                            }
                                            }