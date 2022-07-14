/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode, TreeNode> parents ;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        List<Integer> res = new ArrayList<>();
        if(root==null) return res;
        
        parents = new HashMap<>();
        //get parents of each node
        getParents(root, null);
         
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        
        Set <TreeNode> visited = new HashSet<>();
        visited.add(target);
        int dist=0;
        
        //iterate over queue
        while(!q.isEmpty()){
            int size = q.size();
            
            for( int i =0;i<size;i++){
                
                //if dist matches k get all nodes from queue 
                if(dist ==k){
                    for(TreeNode n :q)
                        res.add(n.val);
                    
                    return res;
                }
                //poll the node 
                TreeNode node = q.poll();
                if(node ==null) continue;
                
                //check the left subtree
                if(node.left!=null && !visited.contains(node.left) ){
                    q.add(node.left);
                    visited.add(node.left);
                }
                 //check the right subtree
                if(node.right!=null && !visited.contains(node.right) ){
                    q.add(node.right);
                    visited.add(node.right);
                }
                
                //get the parent 
                TreeNode par= parents.get(node);
                
                if(par!=null && !visited.contains(par) ){
                    q.add(par);
                    visited.add(par);
                }
                
                
            }
            dist++;
        }
        
        
        
        return res; 
    }
    
    public void getParents(TreeNode root, TreeNode parent ){
        if(root!=null){
            parents.put(root , parent);
            getParents(root.left,root);
            getParents(root.right,root);
        }
    }
}