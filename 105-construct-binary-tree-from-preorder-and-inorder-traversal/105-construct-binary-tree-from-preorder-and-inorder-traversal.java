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
    int index;
    Map<Integer, Integer> inorderMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        
           /*         3
                      /\
                9           20
                /\          /\
            null null     15. 7    
        
                     inorder:   9 3 15 20 7
                     preorder:   [3,9,20,15,7]
          */
                        
        // build a hashmap to store value -> its index relations
        inorderMap = new HashMap<>();
        
        for (int i = 0; i < inorder.length; i++) 
            inorderMap.put(inorder[i], i);
        
        return getTree(preorder, 0, preorder.length - 1);
    }

    private TreeNode getTree(int[] preorder, int left, int right) {
        // if there are no elements to construct the tree
       
        if(left>right) return null;
        int rootVal = preorder[index++];
        TreeNode root= new TreeNode(rootVal);
        
        //build left subtree
        root.left =  getTree(preorder,left, inorderMap.get(rootVal)-1) ;
        //build right subtree
        root.right=  getTree(preorder, inorderMap.get(rootVal)+1,  right) ;
        
        return root;
    }
}