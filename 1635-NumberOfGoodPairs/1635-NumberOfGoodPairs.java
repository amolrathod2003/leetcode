// Last updated: 4/1/2026, 10:41:19 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>countMap=new HashMap<>();
        int goodPairs=0;
        for(int num:nums){
            if(countMap.containsKey(num)){
                goodPairs+=countMap.get(num);

            }
            countMap.put(num,countMap.getOrDefault(num,0)+1);
        }
        return goodPairs;
        
    }
}