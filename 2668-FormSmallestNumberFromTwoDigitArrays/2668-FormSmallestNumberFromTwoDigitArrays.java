// Last updated: 4/1/2026, 10:40:09 PM
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        int minCommon = Integer.MAX_VALUE;
        for (int num : nums2) {
            if (set1.contains(num)) {
                minCommon = Math.min(minCommon, num);
            }
        }

        if (minCommon != Integer.MAX_VALUE) {
            return minCommon;
        }

        int min1 = Arrays.stream(nums1).min().getAsInt();
        int min2 = Arrays.stream(nums2).min().getAsInt();

        return Math.min(min1 * 10 + min2, min2 * 10 + min1);
    }
}