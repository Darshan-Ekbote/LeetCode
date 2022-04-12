

class Solution {
    public Node cloneGraph(Node node) {
        
        
        if( node==null)    return null;
        
        HashMap <Node, Node> m = new HashMap<>();
       
        Queue<Node> q = new LinkedList<>();
        
        q.add(node);
        
        m.put(node, new Node(node.val));
        
        while(!q.isEmpty()){
            
            int size = q.size();
            
            for(int i=0;i<size;i++){
                
                Node temp = q.poll();
                
                for( Node n : temp.neighbors){
                    
                    if(! m.containsKey(n)){
                        m.put(n,new Node(n.val));
                        q.add(n);
                    }
                    
                    m.get(temp).neighbors.add(m.get(n));
                }
            }
            
        }
        
        return m.get(node) ;
}
}