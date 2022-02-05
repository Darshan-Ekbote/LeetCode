/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
       
        if(node == null)
            return null;
        
        Map <Node , Node> m = new HashMap<>();
        
        Queue<Node> q = new LinkedList<>();
        
        q.add(node);
        m.put(node, new Node(node.val));
        
        while(!q.isEmpty()){
            Node temp = q.poll();
            //visit neighbors of this node 
            for ( Node neighbor : temp.neighbors){
                //if not present in the map add it to the map as a new node
                if(!m.containsKey(neighbor)){
                    m.put( neighbor, new Node(neighbor.val));
                     q.add(neighbor);
                }
                //add neighbors to temp (curr) nodes neighbor list
                m.get(temp).neighbors.add(m.get(neighbor));
               
            }
        }
        
        return m.get(node);
    }
}