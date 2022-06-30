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
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        calculateSum(root,targetSum);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        
        return count;
        
    }
    
    
    public void calculateSum(TreeNode root, int target){
        
        if(root==null) return ;
        target -=root.val;
        if(target==0){
            count++;
        }
        calculateSum(root.left,target);
        calculateSum(root.right,target);
        
        
        
    }

}