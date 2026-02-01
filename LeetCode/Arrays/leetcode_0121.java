// LeetCode 121: Best Time to Buy and Sell Stock
// Approach: Track the minimum buying price so far and update maximum profit by comparing current price with buy price
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: Greedy single-pass traversal efficiently captures the maximum difference with buy before sell constraint

// Solution
class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(buyPrice > prices[i]){
                buyPrice = prices[i];
            }
            profit = Math.max(profit, prices[i]-buyPrice);
        }
        return profit;
    }
}
