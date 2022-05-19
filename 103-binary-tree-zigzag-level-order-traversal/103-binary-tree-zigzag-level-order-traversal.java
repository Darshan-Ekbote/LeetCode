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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        
         if(root==null)
            return levels;
        
        
        Queue <TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int level=1;
        while(!q.isEmpty()){
            int size = q.size();
            List <Integer> temp = new ArrayList<Integer>();
            for(int i =0;i<size;i++){
                TreeNode t = q.peek();
              
                if(t.left !=null)
                    q.add(t.left );
                if(t.right!=null)
                    q.add(t.right );
                
                temp.add(t.val);
                q.remove();
            }
            if(level%2==0) Collections.reverse(temp);
            levels.add(temp);
            level++;
        }
        
       return levels;
  
    }
}