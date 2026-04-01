// Last updated: 4/1/2026, 10:42:25 PM
class Solution {
    public int fib(int n) {
        int[] dp=new int[n+1];
        return solve(n,dp);
    }
    int solve(int n,int[] dp){
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        dp[n]=solve(n-1,dp)+solve(n-2,dp);
        return dp[n];
    }
}