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
