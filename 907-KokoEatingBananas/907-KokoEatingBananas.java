// Last updated: 4/1/2026, 10:42:42 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=Integer.MAX_VALUE;
        while(left<right){
            int mid=left+(right-left)/2;
            int time=0;
            for(int i=0;i<piles.length;i++){
                if(piles[i]<=mid) time++;
                else time+=(piles[i]+mid-1)/mid;

            }
            if(time>h){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
        
    }
}