class Solution {
    public int romanToInt(String s) {
        int num = 0;
        for(int i=0; i<s.length(); i++) {
            if(i == s.length() - 1) {
                num = num + value(s.charAt(i));
                break;
            }
            if(value(s.charAt(i)) < value(s.charAt(i+1))) {
                num = num - value(s.charAt(i));
            } else {
                num = num + value(s.charAt(i));
            }
        }
        return num;
    }
    public int value(char r) 
    { 
        if (r == 'I') 
            return 1; 
        if (r == 'V') 
            return 5; 
        if (r == 'X') 
            return 10; 
        if (r == 'L') 
            return 50; 
        if (r == 'C') 
            return 100; 
        if (r == 'D') 
            return 500; 
        if (r == 'M') 
            return 1000; 
        return -1; 
    } 
}