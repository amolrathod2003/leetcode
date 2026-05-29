// Last updated: 5/29/2026, 12:26:26 PM
1class Solution {
2    public int minElement(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        for(int num:nums){
5            int sum=0;
6            while(num>0){
7                sum+=num%10;
8                num/=10;
9            }
10            min=Math.min(min,sum);
11        }
12        return min;
13    }
14}