// Last updated: 4/1/2026, 10:39:13 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int maxLen = 1;
        int[] serathion = nums.clone();
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = nums[i] >= nums[i - 1] ? left[i - 1] + 1 : 1;
        }
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = nums[i] <= nums[i + 1] ? right[i + 1] + 1 : 1;
        }
        for (int i = 0; i < n; i++) {
            maxLen = Math.max(maxLen, left[i]);
        }
        for (int i = 0; i < n; i++) {
            int leftLen = i > 0 ? left[i - 1] : 0;
            int rightLen = i < n - 1 ? right[i + 1] : 0;
            int bridge = 1;
            if (i > 0 && i < n - 1 && nums[i - 1] <= nums[i + 1]) {
                bridge = leftLen + 1 + rightLen;
            } else {
                bridge = Math.max(leftLen + 1, rightLen + 1);
            }
            maxLen = Math.max(maxLen, bridge);
        }
        return maxLen;
    }
}