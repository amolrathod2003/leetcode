// Last updated: 4/1/2026, 10:39:10 PM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(num<min) min=num;
            if(num>max) max=num;
        }
        boolean[] pre=new boolean[max-min+1];
        for(int num:nums) pre[num-min]=true;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<pre.length;i++){
            if(!pre[i]) ans.add(min+i);
            
        }
        return ans;
        
        
    }
}