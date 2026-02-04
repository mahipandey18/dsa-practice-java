// LeetCode 1: Two Sum
// Approach: Iterate through the array while storing previously seen numbers and their indices in a HashMap; for each element, check if its complement exists
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: HashMap allows constant-time lookups and prevents using the same element twice by checking before inserting

// Solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                //returns [index of complement, curr index]
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
