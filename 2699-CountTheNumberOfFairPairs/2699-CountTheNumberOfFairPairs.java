// Last updated: 4/1/2026, 10:40:08 PM


class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int min = lower - nums[i];
            int max = upper - nums[i];
            int left = lowerBound(nums, i + 1, n - 1, min);
            int right = upperBound(nums, i + 1, n - 1, max);
            count += (right - left);
        }
        return count;
    }

    private static int lowerBound(int[] nums, int start, int end, int target) {
        int ans = end + 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private static int upperBound(int[] nums, int start, int end, int target) {
        int ans = end + 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
