// LeetCode 503: Next Greater Element II
// Approach: Initialize a stack with all elements in reverse order to simulate circular behavior; then traverse the array in reverse, popping smaller or equal elements from the stack and assigning the next greater element from the top of the stack or -1 if empty; finally, push the current element to the stack
// Time Complexity: O(n^2) in worst case (because elements can be pushed and popped multiple times due to duplicates)
// Space Complexity: O(n) for the stack and result array
// Learning: Pre-filling the stack can simulate circular array behavior, but using a simple Stack with repeated pops for duplicates may lead to inefficiency; understanding stack usage for "next greater" problems is key

// Solution
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack <Integer> st = new Stack<>();
        int n = nums.length;
        int res[] = new int[n];

        for(int i = n - 1 ; i >= 0 ; i--){
            st.push(nums[i]);
        }

        for(int i = n - 1 ; i >= 0 ; i--){
            while(!st.isEmpty() && st.peek()<=nums[i]){
                st.pop();
            }
             if(!st.isEmpty()){
                res[i] = st.peek();
            }
            else{
                res[i] = -1;
            }
            st.push(nums[i]);
        }
        return res;
    }
}
