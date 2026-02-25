// LeetCode 105: Construct Binary Tree from Preorder and Inorder Traversal
// Approach: Recursively build the tree; take the first element of preorder as root, find its index in inorder to split left and right subtrees, slice preorder and inorder arrays accordingly, recursively build left and right subtrees, and attach them to root
// Time Complexity: O(n^2) due to array slicing (can be optimized using a hashmap for inorder indices)
// Space Complexity: O(n) for recursion stack and array copies
// Learning: Constructing a binary tree from traversal arrays relies on understanding preorder (root first) and inorder (root in middle) relationships and recursively slicing arrays to build subtrees

// Solution
// Method - 1
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
        }
        int rootVal = preorder[0];
        TreeNode root = new TreeNode(rootVal);
        if(preorder.length == 1){
            return root;
        }
        
        int rootIndex = 0;
        for(int i = 0; i<inorder.length; i++){
            if(inorder[i]==root.val){
                rootIndex = i;
                break;
            }
        }
        int[] leftPreorder = Arrays.copyOfRange(preorder, 1, 1 + rootIndex);
        int[] rightPreorder = Arrays.copyOfRange(preorder, 1 + rootIndex, preorder.length);
        
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, rootIndex);
        int[] rightInorder = Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length);

        root.left = buildTree(leftPreorder, leftInorder);
        root.right = buildTree(rightPreorder, rightInorder);

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
