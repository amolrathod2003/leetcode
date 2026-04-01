// Last updated: 4/1/2026, 10:41:00 PM
class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer>countMap=new HashMap<>();
        for(int num:nums){
            countMap.put(num,countMap.getOrDefault(num,0)+1);

        }
        int sum=0;
        for(int key : countMap.keySet()){
            if(countMap.get(key)==1){
                sum+=key;
            }
        }
        return sum;
        
    }
}