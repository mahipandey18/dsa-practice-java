// LeetCode 496: Next Greater Element I
// Approach: Traverse nums2 from right to left using a monotonic decreasing stack; for each element, pop smaller or equal elements to find the next greater element and store the result in a map, then build the answer for nums1 using this map
// Time Complexity: O(n + m)
// Space Complexity: O(n)
// Learning: Monotonic stack efficiently finds next greater elements by maintaining a decreasing order of values

// Solution
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map <Integer, Integer> map = new HashMap<>();
        Stack <Integer> st = new Stack<>();
        for(int i = nums2.length-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(nums2[i],-1);
            }
            else{
                map.put(nums2[i], st.peek());
            }
            st.push(nums2[i]);
        }
        int ans[] = new int[nums1.length];
        for(int i = 0; i<nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}
