// LeetCode 20: Valid Parentheses
// Approach: Use a stack to store opening brackets; iterate through the string, push opening brackets, and for each closing bracket check if the stack is non-empty and the top matches, then pop; return true only if the stack is empty at the end
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Stack helps validate nested and ordered structures by matching the most recent opening bracket with the current closing bracket

// Solution
class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        int n = s.length();
        
        for(int i = 0; i<n; i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if(s.charAt(i)==')' && st.peek()=='(' || s.charAt(i)=='}' && st.peek()=='{' || s.charAt(i)==']' && st.peek()=='['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.empty();
    }
}
