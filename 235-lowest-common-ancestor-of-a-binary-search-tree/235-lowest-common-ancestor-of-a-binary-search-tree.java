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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        int rVal = root.val;
        
        int pVal = p.val;
        int qVal =q.val;
        
        TreeNode temp = root;
        
        while(temp!=null){
            
            if(pVal > rVal && qVal > rVal )
                return lowestCommonAncestor(root.right, p,q);
            else if(pVal<rVal && qVal < rVal)
                return lowestCommonAncestor( root.left,p,q);
            else
                return temp; 
            
        }
        
        return null;
    }
}