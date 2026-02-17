// LeetCode 144: Binary Tree Preorder Traversal
// Approach: Use recursive DFS where we process the root first, then recursively traverse the left subtree followed by the right subtree, storing node values in a list
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Preorder traversal follows Root-Left-Right order and demonstrates how recursion naturally explores tree depth while using the call stack to manage traversal

// Solution
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root,res);
        return res;
    }

    private void preorder(TreeNode root, List<Integer> res){
        if(root==null){
            return;
        }
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
    }
}
