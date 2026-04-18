// Last updated: 4/18/2026, 11:54:39 AM
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minDis=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int dis=Math.abs(i-start);
                minDis=Math.min(minDis,dis);
            }
        }
        return minDis;
    }
}