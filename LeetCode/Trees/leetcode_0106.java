// LeetCode 106: Construct Binary Tree from Inorder and Postorder Traversal
// Approach: Use a HashMap to store inorder value-to-index mapping for O(1) lookup. Maintain a class-level postIndex starting from the end of postorder. Recursively construct the tree by picking postorder[postIndex] as root, decrementing postIndex, finding the root position in inorder to divide left and right subtrees, and building the right subtree first (since postorder is left → right → root, so reversed order is root → right → left).
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Tree construction from inorder and postorder requires understanding reverse traversal behavior of postorder, correct subtree build order (right before left), and using a global pointer with hashmap to avoid repeated scanning.

// Solution
class Solution {
    Map <Integer, Integer> map = new HashMap<>();
    int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i = 0; i<postorder.length; i++){
            map.put(inorder[i], i);
        }
        postIndex = postorder.length-1;
        return tree(postorder,0,postorder.length-1);
    }
    
    private TreeNode tree(int[]postorder, int start, int end){
        if(start>end) return null;
        
        int rootval = postorder[postIndex--];
        TreeNode root = new TreeNode(rootval);
        if(postorder.length == 1) return root;

        int mid = map.get(rootval);

        root.right = tree(postorder,mid+1,end);
        root.left = tree(postorder,start,mid-1);

        return root;
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
