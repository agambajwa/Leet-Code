import java.util.regex.*;
class Solution {
    public boolean isMatch(String a, String b) {
        return Pattern.matches(b,a);
    }
}