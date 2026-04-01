// Last updated: 4/1/2026, 10:40:59 PM
class Solution {
    public boolean check(int[] nums) {
        int l=0,r=1;
        int n = nums.length;
        int cnt=0;
        while(l<n-1 && r<n){
            if(nums[l]>nums[r]) {
                cnt++;
            }
            if(cnt==2|| (cnt == 1 && nums[0] < nums[n-1])) {
                return false;
            }
            l++;
            r++;
        
        
    }
    return true;
        
    }
}