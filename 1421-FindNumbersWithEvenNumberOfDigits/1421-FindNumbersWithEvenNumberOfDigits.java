// Last updated: 4/1/2026, 10:41:43 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = (int) Math.log10(num) + 1;
            if (digits % 2 == 0) 
                count++;
        }
        return count;
    }
}