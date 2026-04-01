// Last updated: 4/1/2026, 10:45:10 PM
class Solution {
    public int majorityElement(int[] nums) {
        int candd=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candd=nums[i];
            }
            if(candd==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return candd;
        
    }
}