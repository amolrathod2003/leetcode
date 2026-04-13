// Last updated: 4/13/2026, 11:24:05 AM
1class Solution {
2    public int getMinDistance(int[] nums, int target, int start) {
3        int minDis=Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]==target){
6                int dis=Math.abs(i-start);
7                minDis=Math.min(minDis,dis);
8            }
9        }
10        return minDis;
11    }
12}