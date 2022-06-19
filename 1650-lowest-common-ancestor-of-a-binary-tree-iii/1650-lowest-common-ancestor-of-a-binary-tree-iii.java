/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        
        Set<Node> path = pathTrace(p);
        //traverse each node in the path and see if it matches
        while(q.parent!=null){
          if (path.contains(q)) return q;
            q=q.parent;
        }
        
        return q;
    }
    
   public Set<Node> pathTrace(Node p){
        Set<Node> path = new HashSet<Node>();
        //trace the path from node to the root
        while(p.parent!=null){
            
            path.add(p);
            p=p.parent;
        }
        return path;
    }
}