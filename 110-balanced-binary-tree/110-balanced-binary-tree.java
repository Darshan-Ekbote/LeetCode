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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        
        int lh =calculate(root.left);
        int rh = calculate(root.right);
        
        if(Math.abs(lh-rh)>1) return false;
        else {
            boolean left  =isBalanced(root.left);
            boolean right = isBalanced(root.right);
        
            return left && right ; 
        }

               
    }
    
    public int calculate(TreeNode root){
        
        
        if(root==null) return 0;
        
        int l = 1+ calculate(root.left);
        
        int r = 1+ calculate(root.right);
        
        return Math.max(l,r);
        
        
    }
}

