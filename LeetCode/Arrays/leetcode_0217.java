// LeetCode 217: Contains Duplicate
// Approach: Use a HashSet to track seen elements and detect duplicates while inserting
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: HashSet insertion returns a boolean, enabling duplicate detection in a single pass

// Solution
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
