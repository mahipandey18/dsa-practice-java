// LeetCode 49: Group Anagrams
// Approach: Use a HashMap where the key is the sorted version of each string and the value is a list of original strings sharing that key
// Time Complexity: O(n * k log k), where n is the number of strings and k is the average string length
// Space Complexity: O(n * k)
// Learning: A canonical representation (sorted string) helps group anagrams efficiently using a map

// Solution
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char [] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
