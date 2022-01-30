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
    int diameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        //find the  height at each node 
        height(root);
        return diameter-1;
    }
    
    public int height(TreeNode root){
        
        if(root==null) return 0;
        //find the left  height and right height  , +1 not added to left and right height so that root wont be calculated twice 
        int left =  height(root.left);
        int right =  height(root.right);
        //take the max of the path through the node ...
        //{ left path -> node (+1) -> right path  } or
        //the already calcualted diameter 
        diameter = Math.max( left+right+1 , diameter);
        
        // +1 for each level or depth 
        return Math.max(left, right)+1 ;
        
        
    }
}