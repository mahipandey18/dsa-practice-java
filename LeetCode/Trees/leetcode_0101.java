// LeetCode 101: Symmetric Tree
// Approach: Use recursive DFS with a helper function isMirror(left, right); if both nodes are null return true, if one is null return false, if values differ return false, otherwise recursively compare left.left with right.right and left.right with right.left
// Time Complexity: O(n)
// Space Complexity: O(h)
// Learning: Symmetry in binary trees requires mirror comparison, where recursive calls pair opposite children and combine results using logical AND to verify both structure and values

// Solution
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;

        return isMirror(root.left,root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right){
        
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;

        if(left.val != right.val) return false;
        if(left.left==right.right && left.right==right.left){
            return true;
        }
        return isMirror(left.left,right.right) && isMirror(left.right,right.left);
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
