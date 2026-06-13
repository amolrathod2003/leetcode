// Last updated: 6/13/2026, 12:52:20 PM
class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer>ls=new ArrayList<>();
        for(int num:nums){
             List<Integer> temp=new ArrayList<>();
             while(num>0){
                int dig=num%10;
                temp.add(dig);
                num=num/10;

             }
             Collections.reverse(temp);
             ls.addAll(temp);

        }
         int[] result = new int[ls.size()];
         for(int i=0;i<ls.size();i++){
            result[i]=ls.get(i);
         }
         return result;
        
    }
}