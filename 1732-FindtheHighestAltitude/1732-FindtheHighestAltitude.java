// Last updated: 6/19/2026, 9:35:20 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int max=0;
4        int cur=0;
5        for(int g : gain){
6            cur+=g;
7            if(cur>max){
8                max=cur;
9            }
10        }
11        return max;
12        
13    }
14}