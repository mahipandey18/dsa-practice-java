// LeetCode 84: Largest Rectangle in Histogram
// Approach: Use a monotonic increasing stack storing indices; iterate from 0 to n (inclusive) and treat the extra iteration as height 0 to force stack cleanup, popping taller bars when a smaller height is found and computing area using popped height with width determined by current index and the new stack top
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Monotonic stack efficiently finds previous and next smaller elements in a single pass, enabling optimal rectangle area calculation

// Solution
import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <Integer> st = new Stack<>();
        int maxArea = 0;
        int currH = 0;
        int n = heights.length;

        for(int i = 0; i<=n; i++){
            if(i==n){
                currH = 0;
            }
            else{
                currH = heights[i];
            }

            while(!st.isEmpty() && currH < heights[st.peek()]){
                int h = heights[st.pop()];
                int w;
                if(st.isEmpty()){
                    w = i;
                }
                else{
                    w = i-st.peek()-1;
                }
                maxArea = Math.max(maxArea, h*w);
            }
            st.push(i);
        }
        return maxArea;
    }
}
