// LeetCode 142: Linked List Cycle II
// Approach: Use Floyd’s Cycle Detection to detect the cycle; once slow and fast meet, reset one pointer to head and move both one step at a time; the node where they meet is the cycle start
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: After detecting a cycle, moving one pointer to head and advancing both at same speed guarantees they meet at the cycle entry

// Solution
