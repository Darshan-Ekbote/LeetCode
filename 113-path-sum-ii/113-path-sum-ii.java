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
    List<List<Integer>> nodes = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        
        dfs(root,new ArrayList<>(), targetSum);
        
        
        return nodes;
        
    }
    
    public void dfs(TreeNode root, ArrayList<Integer> temp, int targetSum){
        
        
        if( root ==null) return ;
        
        temp.add(root.val);
        
        if(root.left==null && root.right == null && root.val == targetSum) 
            nodes.add(new ArrayList<>(temp));
        
        dfs(root.right, temp, targetSum-root.val);
        dfs(root.left, temp, targetSum-root.val);
        
        
        temp.remove(temp.size()-1);
        return;
    }
}