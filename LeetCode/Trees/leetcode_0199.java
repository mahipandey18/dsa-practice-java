// LeetCode 199: Binary Tree Right Side View
// Approach: Use Breadth First Search (BFS) with a Queue; process nodes level by level using queue.size(), and for each level add the value of the last node processed (i == size - 1) to capture the rightmost node
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: In level-based BFS problems, controlling child insertion order and selecting the last node of each level allows extraction of the tree’s visible right side efficiently

// Solution
