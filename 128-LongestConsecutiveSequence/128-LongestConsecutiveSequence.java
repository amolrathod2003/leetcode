// Last updated: 4/1/2026, 10:45:32 PM
import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxSeqLength = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentSeqLength = 1;
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSeqLength++;
                }
                maxSeqLength = Math.max(maxSeqLength, currentSeqLength);
            }
        }

        return maxSeqLength;
    }
}
