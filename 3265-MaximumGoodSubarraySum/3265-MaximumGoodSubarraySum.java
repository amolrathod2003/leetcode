// Last updated: 4/1/2026, 10:39:54 PM
import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long res = Long.MIN_VALUE;
        boolean found = false;
        long prefixSum = 0;
        Map<Integer, Long> minPrefix = new HashMap<>();

        for (int num : nums) {
            prefixSum += num;
            if (minPrefix.containsKey(num - k)) {
                res = Math.max(res, prefixSum - minPrefix.get(num - k));
                found = true;
            }
            if (minPrefix.containsKey(num + k)) {
                res = Math.max(res, prefixSum - minPrefix.get(num + k));
                found = true;
            }
            minPrefix.put(num, Math.min(minPrefix.getOrDefault(num, Long.MAX_VALUE), prefixSum - num));
        }

        return found ? res : 0;
    }
}
