// LeetCode 543: Diameter of Binary Tree
// Approach: Use a postorder DFS to compute the height of each node while updating a global variable maxLen with the maximum value of left height + right height at every node; return 1 + max(left, right) as height to parent
// Time Complexity: O(n)
// Space Complexity: O(h)
// Learning: Many tree problems combine height calculation with a global answer update during postorder traversal, allowing diameter to be computed efficiently in a single DFS

// Solution
class Solution {
    int maxLen;
    public int diameterOfBinaryTree(TreeNode root) {
        dia(root);
        return maxLen;
    }

    private int dia(TreeNode node){
        if(node==null){
            return 0;
        }

        int l = dia(node.left);
        int r = dia(node.right);
        maxLen = Math.max(maxLen, l+r);

        return 1+Math.max(l,r);
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
