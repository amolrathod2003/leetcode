// Last updated: 4/1/2026, 10:43:43 PM
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>set=new HashMap<>();
        set.put(0,-1);
        int sum=0,maxLength=0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i]==1?1: -1;
            if(set.containsKey(sum)){
                maxLength=Math.max(maxLength,i-set.get(sum));
            }else {
                set.put(sum,i);
            }
        }
        return maxLength;
       

        
    }
}