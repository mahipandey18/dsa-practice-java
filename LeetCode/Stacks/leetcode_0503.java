// LeetCode 503: Next Greater Element II
// Approach: Initialize a stack with all elements in reverse order to simulate circular behavior; then traverse the array in reverse, popping smaller or equal elements from the stack and assigning the next greater element from the top of the stack or -1 if empty; finally, push the current element to the stack
// Time Complexity: O(n^2) in worst case (because elements can be pushed and popped multiple times due to duplicates)
// Space Complexity: O(n) for the stack and result array
// Learning: Pre-filling the stack can simulate circular array behavior, but using a simple Stack with repeated pops for duplicates may lead to inefficiency; understanding stack usage for "next greater" problems is key

// Solution
