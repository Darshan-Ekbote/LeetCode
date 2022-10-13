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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> avg  = new ArrayList<>();
        
        if(root==null) return avg;
        
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            
            Double sum=0.0;
            Double size= Double.valueOf(q.size());
            
            for( int i=0;i<size;i++){
                
                TreeNode temp = q.poll();
                sum +=  temp.val;
                
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            
            avg.add(sum/size);
        }
        return avg;
     }
}