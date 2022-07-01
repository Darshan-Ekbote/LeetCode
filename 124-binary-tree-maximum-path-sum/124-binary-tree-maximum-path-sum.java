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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        getMaxPath(root);
        
        return maxSum;
    }
    
   public int getMaxPath( TreeNode root){
       
      
       if(root==null) return 0;
       
       int left = Math.max(getMaxPath(root.right),0);
       
       int right= Math.max(getMaxPath(root.left),0);
       
       int currSum = root.val + left+right;
       
       maxSum = Math.max(maxSum, currSum);
       
       return root.val+ Math.max(left,right);
       
       
       }
}