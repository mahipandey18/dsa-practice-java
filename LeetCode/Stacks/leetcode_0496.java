// LeetCode 496: Next Greater Element I
// Approach: Traverse nums2 from right to left using a monotonic decreasing stack; for each element, pop smaller or equal elements to find the next greater element and store the result in a map, then build the answer for nums1 using this map
// Time Complexity: O(n + m)
// Space Complexity: O(n)
// Learning: Monotonic stack efficiently finds next greater elements by maintaining a decreasing order of values

// Solution
