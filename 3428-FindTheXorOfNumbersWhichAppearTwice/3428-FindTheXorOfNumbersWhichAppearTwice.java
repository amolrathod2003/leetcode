// Last updated: 4/1/2026, 10:39:49 PM
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] freq=new int[51];
        int ans=0;
        for(int num:nums){
            freq[num]++;
        }
        for(int i=1;i<=50;i++){
            if(freq[i]==2){
                ans^=i;
            }
        }
        return ans;
    }
}