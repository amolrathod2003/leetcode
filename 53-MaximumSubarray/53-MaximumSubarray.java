// Last updated: 5/26/2026, 2:31:53 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3
4        int cursum=nums[0];
5        int max=nums[0];
6        for(int i=1;i<nums.length;i++){
7            cursum=Math.max(nums[i],cursum+nums[i]);
8            max=Math.max(max,cursum);
9        }
10        return max;
11
12        
13    }
14}