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
    //PQ with custome sorting 
    PriorityQueue <Integer> pq = new PriorityQueue<>( (a,b) -> b-a  );
    
    public int kthSmallest(TreeNode root, int k) {
        
        inorder( root,k);
        //get the head of PQ which will have Kth smallest element 
        //beacuse we used if condition to remove element if PQ size exceeds k 
        int kth= pq.poll();
        return kth;
    }
    
    public void inorder(TreeNode root , int k){
        
        if(root==null) return;
        
        inorder(root.left,k);
        pq.add(root.val);
        //will maintain k smallest elemets in PQ
        //no wastage of space
        if( pq.size()>k) pq.poll();
        
        inorder(root.right,k);
    }
}