// LeetCode 222: Count Complete Tree Nodes
// Approach: Use Breadth-First Search (BFS) with a queue; start by adding the root to the queue, then repeatedly remove a node, increment the count, and add its left and right children if they exist until the queue becomes empty
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Level-order traversal ensures each node is visited exactly once, making BFS a straightforward way to count all nodes in a binary tree

// Solution
class Solution {
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int count = 0;
        Queue <TreeNode> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            TreeNode node = q.remove();
            count++;

            if(node.left!=null){
                q.add(node.left);
            }
            if(node.right!=null){
                q.add(node.right);
            }

        }

        return count;
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
