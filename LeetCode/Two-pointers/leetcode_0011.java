// LeetCode 11: Container With Most Water
// Approach: Use two pointers starting at both ends of the array; calculate area using the shorter height and move the pointer pointing to the shorter line inward
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: Moving the pointer at the shorter height helps explore potentially larger areas efficiently

// Solution
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int area = 0;

        while(l<r){
            int h = Math.min(height[l], height[r]);
            int len = r - l;
            area = Math.max(area,h*len);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }      
        return area;
    }
}
