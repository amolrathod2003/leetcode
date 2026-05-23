// Last updated: 5/23/2026, 11:11:26 AM
1class Solution {
2    public boolean check(int[] nums) {
3        int cnt=0;
4        int n=nums.length;
5        for(int i=0;i<n;i++){
6            if(nums[i]>nums[(i+1)%n]){
7                cnt++;
8            }
9        }
10        return cnt<=1;
11
12        
13    }
14}