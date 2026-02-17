// LeetCode 145: Binary Tree Postorder Traversal
// Approach: Use recursive DFS where we first traverse the left subtree, then the right subtree, and finally process the root, storing node values in a list
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Postorder traversal follows Left-Right-Root order and is useful for problems that require processing children before their parent, such as tree deletion or bottom-up calculations

// Solution
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorder(root,res);
        return res;
    }
    private void postorder(TreeNode root, List <Integer> res){
        if(root==null){
            return;
        }
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.val);
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
