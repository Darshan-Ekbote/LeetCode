
class Solution {
    public Node connect(Node root) {
        
        if(root == null ) return null;
        
        Queue <Node> q = new LinkedList<>();
        
        q.add(root);
        
        while( !q.isEmpty()){
            
            int size = q.size();
            
            Node right = null;
            
            for( int i =0;i<size;i++){
                    Node temp = q.peek();
                //point to the right 
                    temp.next = right;
                    right = temp;
                //add right first 
                 if(temp.right!=null) q.add(temp.right);
                 if(temp.left!= null) q.add(temp.left);
                
                
                //remove the node
                
                q.poll();
                
            }
        }
        
        return root;
    }
}