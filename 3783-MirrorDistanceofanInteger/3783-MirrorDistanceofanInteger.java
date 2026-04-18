// Last updated: 4/18/2026, 11:52:23 AM
1class Solution {
2    public int mirrorDistance(int n) {
3        int rev=0;
4        for(int i=n;i>0;i/=10){
5            rev=rev*10+i%10;
6        }
7        return Math.abs(rev-n);
8        
9    }
10}