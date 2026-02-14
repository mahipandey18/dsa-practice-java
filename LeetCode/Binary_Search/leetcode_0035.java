// LeetCode 35: Search Insert Position  
// Approach: Apply iterative binary search with low and high pointers; compute mid = low + (high - low) / 2, return mid if target is found, otherwise adjust the search space based on comparison, and return the insertion index after the loop  
// Time Complexity: O(log n)  
// Space Complexity: O(1)  
// Learning: Binary search can be extended to determine the correct insertion position by carefully handling boundary updates when the target is not present

// Solution
