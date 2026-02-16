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
