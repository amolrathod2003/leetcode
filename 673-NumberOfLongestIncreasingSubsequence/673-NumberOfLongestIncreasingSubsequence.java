// Last updated: 4/1/2026, 10:43:14 PM
class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] cnt = new int[n];
        int maxi = 1;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            cnt[i] = 1;
            for (int prev = 0; prev < i; prev++) {
                if (nums[prev] < nums[i]) {
                    if (dp[prev] + 1 > dp[i]) {
                        dp[i] = dp[prev] + 1;
                        cnt[i] = cnt[prev];
                    } else if (dp[prev] + 1 == dp[i]) {
                        cnt[i] += cnt[prev];
                    }
                }
            }
            maxi = Math.max(maxi, dp[i]);
        }
        int nos = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == maxi) nos += cnt[i];
        }
        return nos;
    }
}