// LeetCode 226: Invert Binary Tree
// Approach: Use recursion (postorder traversal); recursively invert the left and right subtrees first, then swap the left and right child pointers of the current node, and return the root
// Time Complexity: O(n)
// Space Complexity: O(h)
// Learning: Tree inversion can be done by recursively processing subtrees and modifying pointers in place, reinforcing the bottom-up nature of postorder traversal

// Solution
class Solution {
    public TreeNode invertTree(TreeNode root) {

        if(root==null) return null;

        invertTree(root.left);
        invertTree(root.right);
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }
}
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
