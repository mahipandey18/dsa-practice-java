// LeetCode 543: Diameter of Binary Tree
// Approach: Use a postorder DFS to compute the height of each node while updating a global variable maxLen with the maximum value of left height + right height at every node; return 1 + max(left, right) as height to parent
// Time Complexity: O(n)
// Space Complexity: O(h)
// Learning: Many tree problems combine height calculation with a global answer update during postorder traversal, allowing diameter to be computed efficiently in a single DFS

// Solution
