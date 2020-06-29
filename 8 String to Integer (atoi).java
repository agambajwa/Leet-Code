class Solution {
    public int myAtoi(String str) {
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!Character.isSpaceChar(c))
                return convertToInteger(str.substring(i));

        }

        return 0;
    }

    public static int convertToInteger(String str) {
        double result = 0;
        int sign = 1, i = 0;

        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            sign = str.charAt(0) == '+' ? 1 : -1;
            i++;
        }

        while (i < str.length()) {
            char c = str.charAt(i);
            
            if ((c >= '0' && c <= '9')) {

                result = 10 * result + (c - '0');

            } else break;

            i++;

        }

        if (sign==-1)
        result = -result;

        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if (result < Integer.MIN_VALUE) 
            return Integer.MIN_VALUE;
        


        return (int) result;
    }
}