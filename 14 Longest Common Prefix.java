class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        int min = strs[0].length();
        
        for(int i=1; i<strs.length; i++) {
            if(min > strs[i].length()) {
                min = strs[i].length();
            }
        }
        
        String result = "";
        char curr;
        for(int i=0; i<min; i++) {
            curr = strs[0].charAt(i);
            for(int j=0; j<strs.length; j++) {
                if(strs[j].charAt(i) != curr) {
                    return result;
                }
            }
            result = result + curr;
        }
        return result;
    }
}