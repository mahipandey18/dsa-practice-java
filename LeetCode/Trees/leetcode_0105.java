// Method - 1

// LeetCode 105: Construct Binary Tree from Preorder and Inorder Traversal
// Approach: Recursively build the tree; take the first element of preorder as root, find its index in inorder to split left and right subtrees, slice preorder and inorder arrays accordingly, recursively build left and right subtrees, and attach them to root
// Time Complexity: O(n^2) due to array slicing (can be optimized using a hashmap for inorder indices)
// Space Complexity: O(n) for recursion stack and array copies
// Learning: Constructing a binary tree from traversal arrays relies on understanding preorder (root first) and inorder (root in middle) relationships and recursively slicing arrays to build subtrees

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

// Method - 2
// LeetCode 105: Construct Binary Tree from Preorder and Inorder Traversal
// Approach: Use a HashMap to store inorder value-to-index mapping for O(1) lookup. Maintain a class-level preIndex to track the current root in preorder traversal. Recursively build the tree by picking preorder[preIndex] as root, finding its position in inorder to divide left and right subtrees, and constructing left subtree before right subtree.
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Efficient tree construction from traversals requires understanding preorder (root-first) behavior, inorder partitioning for subtree boundaries, and using a global pointer plus hashmap to avoid repeated scanning and array slicing.

// Solution
class Solution {
    Map<Integer, Integer> map = new HashMap<>(); // inorder value -> index
    int preIndex = 0; // tracks the current root in preorder

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return tree(preorder, 0, inorder.length - 1);
    }

    private TreeNode tree(int[] preorder, int start, int end) {
        if (start > end) return null;

        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        int mid = map.get(rootVal);

        root.left = tree(preorder, start, mid - 1);
        root.right = tree(preorder, mid + 1, end);

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
