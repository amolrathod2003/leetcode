// Last updated: 4/1/2026, 10:39:43 PM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> seen=new HashSet<>();
        List<Integer> duplicates=new ArrayList<>();
        for(int num:nums){
            if(seen.contains(num)){
                duplicates.add(num);
            }else{
                seen.add(num);
            }
        } 
        return new int[]{duplicates.get(0),duplicates.get(1)};
        
    }
}