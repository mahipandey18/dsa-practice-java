// LeetCode 199: Binary Tree Right Side View
// Approach: Use Breadth First Search (BFS) with a Queue; process nodes level by level using queue.size(), and for each level add the value of the last node processed (i == size - 1) to capture the rightmost node
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: In level-based BFS problems, controlling child insertion order and selecting the last node of each level allows extraction of the tree’s visible right side efficiently

// Solution
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue <TreeNode> q = new LinkedList<>();

        if(root==null){
            return res;
        }

        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i<size; i++){
                TreeNode node = q.remove();
                if(i == size-1){
                    res.add(node.val);
                }
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                q.add(node.right);
                }
            }
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
