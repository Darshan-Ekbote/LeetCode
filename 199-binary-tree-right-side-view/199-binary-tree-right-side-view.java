/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res =  new ArrayList<Integer>();
        if(root==null) return  res;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        q.add(root);
         
        while(! q.isEmpty()){
            int size = q.size();
            List<Integer> rightSide =  new ArrayList<Integer>();
           
            for(int i =0;i< size;i++){
                
                TreeNode temp = q.peek();
                 rightSide.add(temp.val);
                if(temp.right!=null)
                    q.add(temp.right);
                if(temp.left!=null)
                    q.add(temp.left);
                
                
                q.remove();
            }
            
            res.add(rightSide.get(0));
            
        }
        
        
        return res;
    }
}