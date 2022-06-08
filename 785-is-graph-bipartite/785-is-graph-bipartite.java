class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int[] colors = new int[graph.length];
        
        for(int i=0; i < graph.length; i++){
            //if i node not visited ie, color =0
            if(colors[i] == 0 && !isValidColor(graph, i, colors, 1))
                return false;
        }
        return true;
    }
    
    boolean isValidColor(int[][] graph, int src, int[] colors, int color){
        //if not visited 
        if(colors[src] != 0)
            return colors[src] == color;
        
        colors[src] = color;
        
        for(int node : graph[src]){
            //if there node and neigh has same color then return false
            if(colors[node] == colors[src] || !isValidColor(graph, node, colors, -color))
                return false;
        }
        return true;
    }
}
