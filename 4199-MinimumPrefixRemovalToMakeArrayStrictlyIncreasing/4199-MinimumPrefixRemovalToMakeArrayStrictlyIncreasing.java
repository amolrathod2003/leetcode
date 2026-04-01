// Last updated: 4/1/2026, 10:39:09 PM
class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]<nums[i+1]){
            i--;
        }
        if(i==-1) return 0;
        return i+1;
        
    }
}