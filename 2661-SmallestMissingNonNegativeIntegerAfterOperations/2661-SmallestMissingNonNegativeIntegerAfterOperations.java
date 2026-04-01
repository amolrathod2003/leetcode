// Last updated: 4/1/2026, 10:40:11 PM
class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] count= new int[value];
        for(int num:nums){
            int rem=((num%value)+value)%value;
            count[rem]++;
        }
        int mex=0;
        while(true){
            int rem=mex%value;
            if(count[rem]>0){
                count[rem]--;
                mex++;
            } else{
                break;
            }
        }
        return mex;
        
    }
}