// LeetCode 107: Binary Tree Level Order Traversal II
// Approach: Use Breadth First Search (BFS) with a Queue; process nodes level by level using queue.size(), collect each level’s values in a list, and insert each level at index 0 of the result list to build bottom-up order directly
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Inserting each level at the front of the result list allows bottom-up traversal without reversing at the end, reinforcing the BFS level-by-level processing pattern

// Solution
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List <List<Integer>> res = new ArrayList<>();
        Queue <TreeNode> q = new LinkedList<>();

        if(root==null){
            return res;
        }

        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i<size; i++){
                TreeNode node = q.remove();
                level.add(node.val);

                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            res.add(0,level);
        }
        return res;
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
