// LeetCode 100: Same Tree
// Approach: Use recursive DFS; if both nodes are null return true, if one is null return false, if values differ return false, otherwise recursively check left and right subtrees and return the logical AND of both results
// Time Complexity: O(n)
// Space Complexity: O(h)
// Learning: Tree comparison problems rely on matching both structure and node values using recursion, where each call verifies current nodes and combines subtree results using logical AND

// Solution
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p == null || q == null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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
