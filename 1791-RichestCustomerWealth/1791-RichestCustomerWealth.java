// Last updated: 4/1/2026, 10:41:04 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0; 
        for (int[] person : accounts) {
            int sum = 0; 
            for (int wealth : person) {
                sum += wealth; 
            }
            if (sum > maxWealth) {
                maxWealth = sum; 
            }
        }
        return maxWealth; 
    }
}
