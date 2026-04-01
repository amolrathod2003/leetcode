// Last updated: 4/1/2026, 10:39:21 PM


class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = n - 1;
        for (int i = 0; i < n; i++) {
            int curEnd = UpperBound(1L * nums[i] * k, nums, i + 1);
            ans = Math.min(ans, n - (curEnd - i));
        }
        return ans;
    }
    private int UpperBound(long target, int[] nums, int left) {
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}

