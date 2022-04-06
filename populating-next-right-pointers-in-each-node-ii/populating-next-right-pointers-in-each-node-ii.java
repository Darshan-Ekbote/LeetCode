class Solution {
    public Node connect(Node root) {
        
        if(root==null || (root.left==null && root.right==null))
            return root;
        
        Queue<Node> q= new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            Node prev= null;
            for(int i=0;i<size;i++){
                Node temp = q.poll();
                temp.next= prev;
                prev= temp;
                 if(temp.right!=null)
                    q.add(temp.right);
                if(temp.left!=null)
                    q.add(temp.left);
            }
        }
        return root;
    }
}