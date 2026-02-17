// LeetCode 102: Binary Tree Level Order Traversal
// Approach: Use Breadth First Search (BFS) with a Queue; add the root to the queue, then for each iteration process all nodes currently in the queue (one level) by looping size times, adding their values to a list and pushing their children into the queue
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Level order traversal requires processing nodes level by level, and using queue.size() inside the loop ensures correct separation of each tree level

// Solution
