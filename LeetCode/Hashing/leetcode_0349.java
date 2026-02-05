// LeetCode 349: Intersection of Two Arrays
// Approach: Store all elements of nums1 in a HashMap with a marker value (1); then iterate through nums2 and whenever an element exists in the map with value 1, add it to the result list and mark it as used (set value to 0) to avoid duplicates
// Time Complexity: O(n + m), where n is the length of nums1 and m is the length of nums2
// Space Complexity: O(n), for storing elements of nums1 in the HashMap and the result array
// Learning: Using a HashMap allows constant-time lookups and helps ensure each intersecting element is added only once

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
