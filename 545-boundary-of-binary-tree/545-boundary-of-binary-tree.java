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
     final List<Integer> answer = new ArrayList<>();

     public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if (!isLeaf(root))
            answer.add(root.val);
        if (root.left != null)
            addLeftBorder(root.left);
			
        addLeafs(root);

        if (root.right != null)
            addRightBorder(root.right);

        return answer;
    }
        

    boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    void addLeftBorder(TreeNode node) {
        if (!isLeaf(node)) {
            answer.add(node.val);
            if (node.left != null) {
                addLeftBorder(node.left);
            } else {
                addLeftBorder(node.right);
            }
        }
    }

    void addRightBorder(TreeNode node) {
        if (!isLeaf(node)) {
            if (node.right != null) {
                addRightBorder(node.right);
            } else {
                addRightBorder(node.left);
            }
			// collect in reversed order
            answer.add(node.val);
        }
    }

    void addLeafs(TreeNode node) {
        if (node == null) return;

        if (isLeaf(node)) {
            answer.add(node.val);
        } else {
            addLeafs(node.left);
            addLeafs(node.right);
        }
    }

}