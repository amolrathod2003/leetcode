// Last updated: 4/1/2026, 10:44:43 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];

        
    }
}