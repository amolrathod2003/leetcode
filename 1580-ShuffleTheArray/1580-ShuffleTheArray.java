// Last updated: 4/1/2026, 10:41:22 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] nums2=new int[nums.length];
        int z=0;
        for(int i=0;i<nums.length;i++){
            nums2[i]=nums[z];
            z++;
            i++;
            nums2[i]=nums[n];
            n++;
        }
        return nums2;
        
    }
}