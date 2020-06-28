class Solution {
    public boolean isPalindrome(int x) {
        String X = Integer.toString(x);
        String Y = new StringBuilder().append(x).reverse().toString();
        return X.equals(Y);
    }
}