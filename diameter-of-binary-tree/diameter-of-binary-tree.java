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
    int diameter =0 ;
    public int diameterOfBinaryTree(TreeNode root) {
        getDiameter(root);
        
        return diameter -1 ;
    }
    
    public int getDiameter (TreeNode root){
        
        
        if(root==null) return 0;
        
        int left= getDiameter(root.left) ;
        int right= getDiameter(root.right);
        
        int currDiameter = left+right+1;
        
        diameter = Math.max(diameter,currDiameter);
        
        return Math.max(left,right)+1;
    }
    
}