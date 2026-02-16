// LeetCode 875: Koko Eating Bananas  
// Approach: Apply binary search on the possible eating speed range from 1 to max(piles); for each mid speed, compute total required hours using ceiling division and adjust the search space to find the minimum valid speed  
// Time Complexity: O(n log maxPile)  
// Space Complexity: O(1)  
// Learning: Binary search on answer works when the solution space is monotonic, and careful handling of ceiling division and overflow (using long) ensures correctness for large inputs

// Solution
