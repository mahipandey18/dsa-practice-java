// LeetCode 15: 3Sum
// Approach: Sort the array, then fix one element using index i and apply a two-pointer technique (j and k) on the remaining part to find pairs that sum to -nums[i]; skip duplicate values for i, j, and k to avoid repeating triplets
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Learning: Combining sorting with two pointers allows efficient exploration of unique triplets while handling duplicates correctly

// Solution
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List <List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i = 0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = n-1;

            while(j<k){
                int total = nums[i]+nums[j]+nums[k];
                if(total>0){
                    k--;
                }
                else if(total<0){
                    j++;
                }
                else{
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    // Avoiding duplicate triplets - nums[j-1] is the recently added value to res.
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return res;
    }
}
