// Last updated: 6/13/2026, 12:52:00 PM
class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            int sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            min=Math.min(min,sum);
        }
        return min;
    }
}