// Last updated: 5/8/2026, 7:17:40 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer>map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            int dif=target-nums[i];
6            if(map.containsKey(dif)){
7                return new int[]{map.get(dif),i};
8            }
9            map.put(nums[i],i);
10        }
11        return new int[]{-1,1};
12        
13    }
14}