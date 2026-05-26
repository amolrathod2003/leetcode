// Last updated: 5/26/2026, 2:26:56 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n=nums.length;
4        int[] res=new int[n];
5        res[0]=1;
6        for(int i=1;i<n;i++){
7            res[i] = res[i-1] * nums[i-1];
8        }
9        int suf=1;
10        for(int i=n-1;i>=0;i--){
11            res[i]=res[i]*suf;
12            suf*=nums[i];
13        }
14        return res;
15        
16    }
17}