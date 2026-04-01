// Last updated: 4/1/2026, 10:40:26 PM
class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer>result=new ArrayList<>();
        int[] count=new int[1001];
        for(int[] arr:nums){
            for(int i:arr){
                count[i]++;
            }
        }
        for(int i=0;i<count.length;i++){
            if(count[i]==nums.length){
                result.add(i);
            }
        }
        return result;
    }
}