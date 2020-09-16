class Solution {
    public int lengthOfLastWord(String s) {
        // String[] words = s.split(" ");
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }
}