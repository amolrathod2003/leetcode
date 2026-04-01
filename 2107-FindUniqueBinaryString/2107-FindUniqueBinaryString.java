// Last updated: 4/1/2026, 10:40:42 PM
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(nums[i].charAt(i)=='0'){
                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        return sb.toString();
        
    }
}