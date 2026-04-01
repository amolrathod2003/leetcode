// Last updated: 4/1/2026, 10:43:13 PM
class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        int min = 0, max = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                min++;
                max++;
            } else if (c == ')') {
                min--;
                max--;
            } else {
                min--;
                max++;
            }
            if (min < 0) min = 0;
            if (max < 0) return false;
        }
        return min == 0;
    }
}
