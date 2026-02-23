// LeetCode 222: Count Complete Tree Nodes
// Approach: Use Breadth-First Search (BFS) with a queue; start by adding the root to the queue, then repeatedly remove a node, increment the count, and add its left and right children if they exist until the queue becomes empty
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Level-order traversal ensures each node is visited exactly once, making BFS a straightforward way to count all nodes in a binary tree

// Solution
