// Last updated: 4/1/2026, 10:40:27 PM
class Solution {
    public boolean divideArray(int[] nums) {
       int[] count=new int[510];
       for(int num:nums){
        count[num]++;
       }
       for(int frequency:count){
        if(frequency %2!=0){
            return false;

        }
       }
       return true;
    }   
 }
