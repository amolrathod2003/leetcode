// Last updated: 4/1/2026, 10:39:29 PM
class Solution {
    public int minimumPairRemoval(int[] nums) {
        int n = nums.length;
        int cnt = 0;

        while (n > 1) {
            boolean nonDec = true;
            int minSum = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int i = 0; i < n - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    nonDec = false;
                }
                int sum = nums[i] + nums[i + 1];
                if (sum < minSum) {
                    minSum = sum;
                    minIndex = i;
                }
            }

            if (nonDec) {
                return cnt;
            }

            nums[minIndex] = minSum;
            for (int i = minIndex + 1; i < n - 1; i++) {
                nums[i] = nums[i + 1];
            }

            n--;
            cnt++;
        }

        return cnt;
    }
}
