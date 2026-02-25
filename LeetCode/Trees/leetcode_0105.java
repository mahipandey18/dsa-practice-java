// Solution
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
