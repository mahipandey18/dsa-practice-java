// LeetCode 104: Maximum Depth of Binary Tree
// Approach: Use recursive DFS; for each node, compute the depth of its left and right subtrees and return 1 plus the maximum of those two depths
// Time Complexity: O(n)
// Space Complexity: O(h)
// Learning: Tree depth problems follow the classic recursive pattern of solving left and right subtrees and combining results using 1 + max(left, right), reinforcing divide-and-conquer thinking

// Solution
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;

        int depth = 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
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
