// Last updated: 5/26/2026, 1:06:04 PM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashSet<Integer>set=new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5            if(i>k){
6                set.remove(nums[i-k-1]);
7            }
8            if(!set.add(nums[i])){
9                return true;
10            }
11        }
12        return false;
13        
14    }
15}