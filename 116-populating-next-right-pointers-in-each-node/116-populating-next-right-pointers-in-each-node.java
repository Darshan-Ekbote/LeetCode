
class Solution {
    public Node connect(Node root) {
        
        if(root == null ) return null;
        
        Queue <Node> q = new LinkedList<>();
        
        q.add(root);
        
       
        while(!q.isEmpty()){
            
            Node temp = null;
            
            int size = q.size();
            
            for(int i=0;i<size;i++){
                
                Node t = q.poll();
                    
                
                if(t.right!=null) q.add(t.right);
                if(t.left!=null) q.add(t.left);
                
                t.next = temp;
                temp =t;
            }            
            
        }
        
        return root;
    }
}