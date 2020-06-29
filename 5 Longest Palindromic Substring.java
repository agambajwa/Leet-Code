class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = expandPalindrome(s, i, i);
            String even = (i + 1 == s.length()) ? "" : expandPalindrome(s, i, i + 1);
            String candidate = odd.length() > even.length() ? odd :even;
            if (candidate.length() > result.length()) result = candidate;
        }
        return result;
    }
    
    private String expandPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}