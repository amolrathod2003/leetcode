// Last updated: 4/1/2026, 10:45:29 PM
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans = ans ^nums[i];
        }
        return ans;
        
    }
}