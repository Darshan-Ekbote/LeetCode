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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        
        if(root==null) return levels;
        List<Integer> level = new ArrayList<Integer>();
        Queue <TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        
        while( !q.isEmpty()){
            
            int size = q.size();
            level.clear();
            for( int i =0;i< size;i++){
                TreeNode temp = q.peek();
                level.add(temp.val);
                if( temp.left != null)
                    q.add( temp.left);
                
                if( temp.right !=null)
                    q.add(temp.right);
                q.poll();    
            }
            levels.add(new ArrayList<>(level));
        }
        return levels;
    }
}