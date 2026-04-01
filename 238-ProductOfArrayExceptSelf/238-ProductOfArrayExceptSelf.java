// Last updated: 4/1/2026, 10:44:28 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int suf = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * suf;
            suf *= nums[i];
        }
        return res;
    }
}