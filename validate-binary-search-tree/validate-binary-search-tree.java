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
    ArrayList <Integer> bst = new ArrayList<Integer> ();
    public boolean isValidBST(TreeNode root) {
        
        inorder(root);
        int count=0;
        for(int i=0;i<bst.size()-1;i++){
            
            if(bst.get(i)<bst.get(i+1)) count++;
            else break;
        }
        return count== bst.size()-1;
    }
    
    void inorder (TreeNode root){
        
        if(root==null)return;
        
        if(root.left!=null)
            inorder(root.left);
        bst.add(root.val);
        if(root.right!=null)
            inorder(root.right);
        
        
        
    }
}