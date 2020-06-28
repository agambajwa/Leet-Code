class Solution {
    public int reverse(int x) {
        String result = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return (x < 0) ? Integer.parseInt(result) * -1 : Integer.parseInt(result);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}