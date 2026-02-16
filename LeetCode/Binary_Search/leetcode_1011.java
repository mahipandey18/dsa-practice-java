// LeetCode 1011: Capacity To Ship Packages Within D Days  
// Approach: Use binary search on the capacity range from max(weights) to sum(weights); for each mid capacity, simulate loading packages sequentially to compute required days and shrink the search space to find the minimum capacity that allows shipping within the given days  
// Time Complexity: O(n log(sum(weights)))  
// Space Complexity: O(1)  
// Learning: Binary search on answer works for monotonic capacity problems, and careful simulation helps determine whether a candidate capacity satisfies the constraint

// Solution
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int w:weights){
            low = Math.max(w,low);
            high +=w;
        }
        while(low<high){
            int mid = low +(high-low)/2;
            int currW = 0;
            int daysNeed = 1;
            for(int w : weights){
                if(w+currW>mid){
                    daysNeed++;
                    currW = 0;
                }
                currW +=w;
            }
            if(daysNeed <= days){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}
