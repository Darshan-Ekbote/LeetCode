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
    
    int maxDiff = Integer.MIN_VALUE;
    
    public int maxAncestorDiff(TreeNode root) {
        
        if(root==null) return 0;
        
        return compute(root,root.val,root.val);
    }
    
    
    public int compute(TreeNode root,int curMin,int curMax){
        
        if(root==null) return curMax-curMin;
        
         curMin = Math.min(curMin,root.val);
         curMax = Math.max(curMax,root.val);
        
        int left = compute(root.left,curMin,curMax);
        
        int right = compute(root.right,curMin,curMax);
      
        
       return Math.max(left,right);
        
        
    }
}