// Last updated: 4/1/2026, 10:41:11 PM
class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int x : nums) {
            total += x;
        }

        int need = (int)(total % p);
        if (need == 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);

        long pre = 0;
        int n = nums.length;
        int ans = n + 1;

        for (int i = 0; i < n; i++) {
            pre += nums[i];
            int cur = (int)(pre % p);

            int target = (cur - need) % p;
            if (target < 0) target += p;

            if (map.containsKey(target)) {
                ans = Math.min(ans, i + 1 - map.get(target));
            }

            map.put(cur, i + 1);
        }

        return ans >= n ? -1 : ans;
    }
}
