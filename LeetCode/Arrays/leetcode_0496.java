// LeetCode 496: Next Greater Element I
// Approach: Use a brute-force method where for each element in nums1, its position is found in nums2 and the elements to its right are scanned to find the first greater value; if none exists, store -1
// Time Complexity: O(n * m)
// Space Complexity: O(1)
// Learning: Direct scanning helps understand the next greater element concept before optimizing with a stack-based approach

// Solution
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++){
            arr[i] = -1;
            for(int j = 0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    for (int m = j + 1; m < nums2.length; m++) {
                        if (nums2[m] > nums2[j]) {
                            arr[i] = nums2[m];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return arr;
    }
}
