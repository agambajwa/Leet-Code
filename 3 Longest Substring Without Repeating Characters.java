class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        StringBuilder S = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            String ch = "" + s.charAt(i);
            
            if(S.indexOf(ch) != -1){
                S.delete(0, S.indexOf(ch)+1);
            }
            
            S.append(ch);
            
            result = Math.max(result, S.length());
        }
        return result;
    }
}