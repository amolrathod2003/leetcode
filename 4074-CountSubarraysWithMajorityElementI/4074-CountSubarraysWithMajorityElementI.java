// Last updated: 4/1/2026, 10:39:15 PM
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
       int[] var=nums;
        int n=var.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=i;j<n;j++){
                if(var[j]==target) cnt++;
                int len=j-i+1;
                if(cnt*2>len) ans++;
            }
        }
        return ans;
        
    }
}