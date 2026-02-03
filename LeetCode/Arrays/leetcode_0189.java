// LeetCode 189: Rotate Array
// Approach: Use an extra array and place each element at index (i + k) % n to achieve right rotation
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Index mapping with modulo simplifies rotation logic at the cost of extra space

// Solution
class Solution {
    public void rotate(int[] nums, int k) {
        //for rotated array - i index => (i+k)%length index
        int n = nums.length;
        int rotated[] = new int[n];

        for(int i = 0; i<n; i++){
            rotated[(i+k)%n] = nums[i];
        }

        for(int j = 0; j<n; j++){
            nums[j] = rotated[j];
        }
    }
}
