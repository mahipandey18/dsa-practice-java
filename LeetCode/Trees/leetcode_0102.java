// LeetCode 102: Binary Tree Level Order Traversal
// Approach: Use Breadth First Search (BFS) with a Queue; add the root to the queue, then for each iteration process all nodes currently in the queue (one level) by looping size times, adding their values to a list and pushing their children into the queue
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Level order traversal requires processing nodes level by level, and using queue.size() inside the loop ensures correct separation of each tree level

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue <TreeNode> q = new LinkedList<>();
        
        if(root==null){
            return res;
        }

        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List <Integer> level = new ArrayList<>();
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
            res.add(level);
        }
        return res;
    }
}
