// Last updated: 4/1/2026, 10:43:34 PM
class Solution {
    public int arrayPairSum(int[] nums) {
       Arrays.sort(nums);
       int ans=0;
       for(int i=0;i<nums.length;i+=2){
        ans += nums[i];

       }
       return ans;
        
    }
}