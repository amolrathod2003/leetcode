// Last updated: 4/1/2026, 10:40:13 PM
class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        long totalCount = 0;
        long currentPairs = 0;
        int startIndex = 0;

        for (int endIndex = 0; endIndex < nums.length; endIndex++) {
            int num = nums[endIndex];
            int count = hmap.getOrDefault(num, 0);
            currentPairs += count;
            hmap.put(num, count + 1);

            while (currentPairs >= k) {
                totalCount += nums.length - endIndex;
                int startNum = nums[startIndex];
                int startCount = hmap.get(startNum);
                currentPairs -= startCount - 1;
                if (startCount == 1) {
                    hmap.remove(startNum);
                } else {
                    hmap.put(startNum, startCount - 1);
                }
                startIndex++;
            }
        }

        return totalCount;
    }
}
