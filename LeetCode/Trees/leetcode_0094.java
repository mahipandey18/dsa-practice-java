// LeetCode 94: Binary Tree Inorder Traversal
// Approach: Use recursive DFS where we first traverse the left subtree, then process the root, and finally traverse the right subtree, storing values in a list
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Inorder traversal follows Left-Root-Right order and is especially important for Binary Search Trees because it returns elements in sorted order

// Solution
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        inorder(root,res);
        return res;
    }
    private void inorder(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
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
