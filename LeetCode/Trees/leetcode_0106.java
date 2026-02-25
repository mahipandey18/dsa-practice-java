// LeetCode 106: Construct Binary Tree from Inorder and Postorder Traversal
// Approach: Use a HashMap to store inorder value-to-index mapping for O(1) lookup. Maintain a class-level postIndex starting from the end of postorder. Recursively construct the tree by picking postorder[postIndex] as root, decrementing postIndex, finding the root position in inorder to divide left and right subtrees, and building the right subtree first (since postorder is left → right → root, so reversed order is root → right → left).
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Tree construction from inorder and postorder requires understanding reverse traversal behavior of postorder, correct subtree build order (right before left), and using a global pointer with hashmap to avoid repeated scanning.

// Solution
