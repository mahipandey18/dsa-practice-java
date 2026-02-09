// LeetCode 232: Implement Queue using Stacks
// Approach: Use two stacks where inQ handles push operations and outQ handles pop and peek; transfer elements from inQ to outQ only when outQ is empty to maintain FIFO order efficiently
// Time Complexity: Amortized O(1) for push, pop, and peek
// Space Complexity: O(n)
// Learning: Using two stacks with lazy transfer simulates queue behavior while keeping operations efficient

// Solution
