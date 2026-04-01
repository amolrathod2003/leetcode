// Last updated: 4/1/2026, 10:39:22 PM
class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false;
        int i = 0;
        while (i < n - 1 && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == 0 || i == n - 1) return false;
        while (i < n - 1 && nums[i] > nums[i + 1]) {
            i++;
        }
        if (i == n - 1) return false;
        while (i < n - 1 && nums[i] < nums[i + 1]) {
            i++;
        }
        return i == n - 1;
    }
}
