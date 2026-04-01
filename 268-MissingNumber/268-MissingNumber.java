// Last updated: 4/1/2026, 10:44:23 PM
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int actualSum=(nums.length*(nums.length+1))/2;
        int missingNum=actualSum-sum;
        return missingNum;
        
    }
}