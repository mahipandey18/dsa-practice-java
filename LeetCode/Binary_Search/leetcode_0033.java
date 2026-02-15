// LeetCode 33: Search in Rotated Sorted Array  
// Approach: Use modified binary search; at each step determine which half is sorted by comparing nums[low] and nums[mid], then check if the target lies within the sorted half and adjust low or high accordingly  
// Time Complexity: O(log n)  
// Space Complexity: O(1)  
// Learning: In rotated sorted arrays, one half is always sorted, and combining sorted-half detection with boundary checks enables efficient logarithmic search

// Solution
