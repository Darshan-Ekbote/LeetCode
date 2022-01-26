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
    List<Integer> r1 = new ArrayList<Integer>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root1);
        inorder(root2);
        Collections.sort(r1);
        return  r1;
    }
    
    public void inorder( TreeNode root){
            if(root==null) return ;
        
            if(root.left!=null)
            inorder(root.left );
            r1.add(root.val);
            if(root.right!=null)
            inorder(root.right );
            
    }
}