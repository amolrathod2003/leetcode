// Last updated: 4/1/2026, 10:40:33 PM
class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans=1,count=1;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]==prices[i+1]+1) count++;
            else count=1;
            ans+=count;
        }
        return ans;

        
    }
}