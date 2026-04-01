// Last updated: 4/1/2026, 10:42:12 PM
class Solution {
    private boolean checkPos(String s1, String s2) {
        if (s1.length() != s2.length() + 1) return false;
        int first = 0, sec = 0;
        while (first < s1.length()) {
            if (sec < s2.length() && s1.charAt(first) == s2.charAt(sec)) {
                first++;
                sec++;
            } else {
                first++;
            }
        }
        return sec == s2.length();
    }
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        int n = words.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxi = 1;
        for (int i = 0; i < n; i++) {
            for (int prev = 0; prev < i; prev++) {
                if (checkPos(words[i], words[prev]) && dp[prev] + 1 > dp[i]) {
                    dp[i] = dp[prev] + 1;
                }
            }
            maxi = Math.max(maxi, dp[i]);
        }
        return maxi;
    }
}