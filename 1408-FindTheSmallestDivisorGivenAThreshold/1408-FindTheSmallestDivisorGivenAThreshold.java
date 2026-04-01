// Last updated: 4/1/2026, 10:41:44 PM
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = getMax(nums), ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isPossible(nums, mid, threshold)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private boolean isPossible(int[] nums, int divisor, int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor;
            if (sum > threshold) return false;
        }
        return true;
    }

    private int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
        }
        return max;
    }
}
