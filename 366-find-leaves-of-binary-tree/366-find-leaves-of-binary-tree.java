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
    
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        if(root==null) return res;
        //not a leasf node so, find leaves
        while(root.left!=null || root.right!=null){
           List<Integer> leaf= new ArrayList<>();
            dfs(root,leaf);
            res.add(leaf);
        } 
        
        res.add(List.of(root.val));
        return res;
    }
    
    /*
              1
           2     3 
           
              1
           null    3 
    */
    public TreeNode dfs(TreeNode root, List<Integer> res){
        
        if(root==null) return null;
        
        //found the leaf and set it to null
        if(root.left == null && root.right ==null){
            res.add(root.val);
            return null;
        }
        
        root.left =dfs(root.left,res);
        root.right= dfs(root.right,res);
        
        
        return root;
    }
}