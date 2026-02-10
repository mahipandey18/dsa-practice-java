// LeetCode 739: Daily Temperatures
// Approach: Use a stack to store indices of temperatures; for each day, pop indices from the stack whose temperatures are less than the current day's temperature, and calculate the difference in indices as the number of days to wait. Push the current index onto the stack for future comparisons.
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Storing indices in a monotonic stack allows efficient calculation of "next greater element" style problems while preserving position information

// Solution
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int ans[] = new int[n];
        Stack <Integer> st = new Stack<>();
        Arrays.fill(ans,0);

        for(int j = 0; j < n; j++){
            while(!st.isEmpty() && temperatures[j]>temperatures[st.peek()]){
                int popped =st.pop();
                ans[popped] = j - popped; 
            }
            st.push(j);  
        }
        return ans;
    }
}
