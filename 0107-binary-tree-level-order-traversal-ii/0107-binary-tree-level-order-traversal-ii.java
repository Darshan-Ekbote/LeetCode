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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
      
        List<List<Integer>> revOrder = new ArrayList<>();
        
        //base condition 
        if( root == null ) return revOrder;
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        
        //iterate over queue 
        
        while(!q.isEmpty()){
            
            int size = q.size();
            
            List<Integer> temp = new ArrayList<>();
            
            //iterate over each level
            for( int i =0;i<size; i++){
               
                TreeNode node = q.poll();
                
                temp.add(node.val);
                
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                
                
                
            }
            
            revOrder.add(new ArrayList<>(temp));
        }
        
        //reverse the order now
        int size = revOrder.size();
        
        List<List<Integer> > finalList = new ArrayList<>();
        
        for( int i =0;i<size ;i++)
            finalList.add(revOrder.get(size-i-1));
        
        return finalList;
        
        
    }
}