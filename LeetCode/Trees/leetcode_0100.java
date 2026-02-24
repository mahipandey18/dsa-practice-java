// LeetCode 100: Same Tree
// Approach: Use recursive DFS; if both nodes are null return true, if one is null return false, if values differ return false, otherwise recursively check left and right subtrees and return the logical AND of both results
// Time Complexity: O(n)
// Space Complexity: O(h)
// Learning: Tree comparison problems rely on matching both structure and node values using recursion, where each call verifies current nodes and combines subtree results using logical AND

// Solution
