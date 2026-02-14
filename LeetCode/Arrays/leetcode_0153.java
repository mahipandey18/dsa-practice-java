// LeetCode 153: Find Minimum in Rotated Sorted Array  
// Approach: Iterate through the entire array and track the minimum value using a variable initialized to Integer.MAX_VALUE  
// Time Complexity: O(n)  
// Space Complexity: O(1)  
// Learning: A simple linear scan guarantees correctness but does not utilize the sorted and rotated property, missing the optimal O(log n) binary search solution

// Solution
class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int num:nums){
            min = Math.min(min,num);
        }
        return min;
    }
}
