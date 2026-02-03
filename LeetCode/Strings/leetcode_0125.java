// Solution
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[',:\"\\s]", "");

        s = s.toLowerCase();
        int len = s.length();

        for(int i = 0; i < len; i++){
            if(s.charAt(i) != s.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}
