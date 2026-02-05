// Solution
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map <Integer, Integer> map = new HashMap<>();
        List <Integer> res = new ArrayList<>();

        for(int x : nums1){
            map.put(x,1);
        }
        for(int y : nums2){
            if(map.containsKey(y) && map.get(y) == 1){
                res.add(y);
                map.put(y,0);
            } 
        }
        int[] ans = new int[res.size()];
        
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }
}
