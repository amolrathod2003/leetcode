// Last updated: 4/1/2026, 10:42:55 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        return (s.length()==goal.length() && (s+s).contains(goal));
        
    }
}