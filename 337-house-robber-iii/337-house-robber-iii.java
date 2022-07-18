class Solution {

    HashMap<TreeNode, Integer> map = new HashMap<>();

    public int rob(TreeNode root) {
        if(root == null) return 0;
        if(map.containsKey(root)) return map.get(root);

        int skipRootMax =  rob(root.left) + rob(root.right);
        int includeRootMax = root.val + robSkip(root.left) + robSkip(root.right);

        map.put(root, Math.max(skipRootMax, includeRootMax));
        return map.get(root);
    }

    public int robSkip(TreeNode root){
        if(root == null) return 0;
        return rob(root.left) + rob(root.right);
    }

}