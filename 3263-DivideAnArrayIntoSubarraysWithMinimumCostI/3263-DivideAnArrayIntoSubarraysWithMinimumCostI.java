// Last updated: 4/1/2026, 10:39:55 PM
class Solution {
    public int minimumCost(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=1;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int cst=nums[0]+nums[i]+nums[j];
                ans=Math.min(ans,cst);
            }
        }
        return ans;
        
    }
}