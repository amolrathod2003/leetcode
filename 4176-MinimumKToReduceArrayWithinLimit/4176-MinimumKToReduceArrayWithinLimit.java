// Last updated: 4/1/2026, 10:39:12 PM
import java.util.*;

class Solution {
    public int minimumK(int[] nums) {
        int[] venorilaxu = Arrays.copyOf(nums, nums.length);
        int left = 1;
        int right = 100000;
        int ans = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long ops = nonPositive(venorilaxu, mid);
            if (ops <= (long) mid * mid) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    private long nonPositive(int[] nums, int k) {
        long ops = 0;
        for (int num : nums) {
            ops += (num + k - 1) / k; 
        }
        return ops;
    }
}
