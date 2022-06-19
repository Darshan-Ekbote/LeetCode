class Solution {
    boolean firstFound = false;
    boolean secondFound = false;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        dfs(root, p,q); // check whether the nodes exist ?
        if(!firstFound || !secondFound) //p or q not found
            return null;
        return lca(root, p ,q); // then find LCA
    }
    
    private TreeNode lca(TreeNode node, TreeNode p , TreeNode q){
        if(node == null) return null;
        if(node.val == p.val || node.val == q.val) return node;
        TreeNode left = lca(node.left, p, q);
        TreeNode right = lca(node.right, p, q);
        if(left != null && right != null) return node;
        return left == null ? right: left; 
    }
    
    private void dfs(TreeNode node, TreeNode p, TreeNode q){
        if(node == null) return;
        if(node.val == p.val) firstFound = true;
        if(node.val == q.val) secondFound = true;
        dfs(node.left, p,q);
        dfs(node.right, p,q);
    }
}