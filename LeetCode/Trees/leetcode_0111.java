// LeetCode 111: Minimum Depth of Binary Tree
// Approach: Use DFS recursion.
// Time Complexity: O(n)
// Space Complexity: O(h)
// Learning: In minimum-depth problems, null children cannot be treated as valid paths.

// Solution
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int depth = 0;

        if(root.left == null){
            depth = 1 + minDepth(root.right);
        }
        else if(root.right==null){
            depth = 1 + minDepth(root.left);
        }
        else{
            depth = 1 + Math.min(minDepth(root.left), minDepth(root.right));
        }
        return depth;
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
