class Solution {
    
    public void union (int[] parent,int a, int b){
       
        int rootA = find(  parent,  a);
        int rootB = find(parent,  b);
        //if parents not equal then make A as a parent of B
        if( rootA!= rootB){
            parent[rootA]=rootB;
        }
         
    }
    // find the parent of the give node in the graph
    public int find (int [] parent, int a ){
        while( parent[a]!=a){
            parent[a] = parent[parent[a]];
            a = parent[a];
        }
        return a;
    }
    
    public int countComponents(int n, int[][] edges) {
        
        int[] parent = new int [n];
        int[][] adj = new int[n][n];
        
        //create parent array
        for( int i=0;i<n;i++)
            parent[i]=i;
        
        
        //create adj list with edges in it
        for( int i = 0 ;i< edges.length;i++){
            adj[edges[i][0]][edges[i][1]]=1;
            adj[edges[i][1]][edges[i][0]]=1;
        }
        
        //Union all the connected components
        for( int i =0;i< n;i++){
            for( int j=0;j< n;j++){
               if(adj[i][j]==1 && i!=j ){
                    union(parent,i,j);
                }
            }
        }
        int disConnectedComponents =0;
        //iterate parent array 
        for( int i = 0; i< n;i++)
            if( i == parent[i])
                disConnectedComponents++;
        
        return disConnectedComponents ; 
        
        
    }
}