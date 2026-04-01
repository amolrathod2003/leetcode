// Last updated: 4/1/2026, 10:39:59 PM
class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int i = 0;
        int minLength = Math.min(s1.length(), Math.min(s2.length(), s3.length()));

        while (i < minLength && s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
            i++;
        }
        return i == 0 ? -1 : (s1.length() - i) + (s2.length() - i) + (s3.length() - i);
    }
}
