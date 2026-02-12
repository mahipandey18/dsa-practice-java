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
