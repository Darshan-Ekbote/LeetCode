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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return inorder(p ,q);
    }
    
    public boolean inorder( TreeNode p, TreeNode q){
        
        if( p == null && q== null) return true;
        else if( p==null) return false;
        else if( q==null) return false;
        
        
        boolean left = inorder(p.left,q.left);
        
        boolean right=  inorder(p.right,q.right);
            
        return (p.val==q.val)&& right && left;
    }
}