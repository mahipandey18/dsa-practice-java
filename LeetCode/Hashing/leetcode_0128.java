// Solution
class Solution {
    public int longestConsecutive(int[] nums) {
        Map <Integer, Integer> map = new HashMap<>();
        int count = 1;
        int maxLen = 1;

        for(int x : nums){
            map.put(x,1);
        }
        if(map.size() == 0){
            return 0;
        }
        int res[] = new int[map.size()];
        int j = 0;

        for (int val : map.keySet()) {
            res[j++] = val;
        }

        Arrays.sort(res);

        for(int i = 1; i< res.length; i++){
            if(res[i] == res[i-1]+1){
                count ++;
                maxLen = Math.max(maxLen, count);
            }
            else{
                count = 1;
            }
        }
        return maxLen;
    }
}
