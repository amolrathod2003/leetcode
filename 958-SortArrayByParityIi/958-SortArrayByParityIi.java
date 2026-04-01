// Last updated: 4/1/2026, 10:42:31 PM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int evenIndex=0;
        int oddIndex=1;
        for(int num:nums){
            if(num%2==0){
                 result[evenIndex]=num;
            evenIndex +=2;
        }else{
            result[oddIndex]=num;
            oddIndex +=2;
            }
        }
        return result;
        
    }
}