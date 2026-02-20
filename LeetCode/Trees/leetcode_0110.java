// LeetCode 110: Balanced Binary Tree
// Approach: Use postorder DFS to compute the height of each subtree; return -1 immediately if any subtree is unbalanced (height difference > 1), and propagate -1 upward to avoid redundant checks; the tree is balanced if the final height is not -1
// Time Complexity: O(n)
// Space Complexity: O(h)
// Learning: Combining height calculation and balance checking in a single postorder traversal avoids repeated computations and enables early termination when imbalance is detected

// Solution
