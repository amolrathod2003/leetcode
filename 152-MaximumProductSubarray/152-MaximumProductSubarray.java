// Last updated: 4/1/2026, 10:45:17 PM
class Solution {
    public int maxProduct(int[] nums) {
        int res=nums[0];
        for(int i=0;i<nums.length;i++){
            int p=1;
            for(int j=i;j<nums.length;j++){
                
                p*=nums[j];
                res=Math.max(res,p);
            }

        }
        return res;
        
    }
}