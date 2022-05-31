class Solution {
     
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (graph == null || graph.length == 0) {
            return result;
        }
           
        LinkedList<Integer> path = new LinkedList<Integer>();
        path.addLast(0);
        
        dfs(0, graph, result, path);
        return result;
    }
    
    // Don't need a visited path
    public void dfs(int node, int[][] graph, List<List<Integer>> result, LinkedList<Integer> currentPath){
        // add the node to the current path
        if(node == graph.length -1){
            result.add(new ArrayList<Integer>(currentPath));
            return;
        }
        for(int dst : graph[node]){
            currentPath.add(dst);
            dfs(dst, graph, result, currentPath);
            currentPath.remove(currentPath.size()-1);
        }
    }
}