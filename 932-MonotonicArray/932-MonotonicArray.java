// Last updated: 4/1/2026, 10:42:39 PM
class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return true; 
        }
        boolean increasing = false;
        boolean decreasing = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                increasing = true; 
            } else if (nums[i] < nums[i - 1]) {
                decreasing = true; 
            }
            if (increasing && decreasing) {
                return false;
            }
        }
        return true;
    }
}
