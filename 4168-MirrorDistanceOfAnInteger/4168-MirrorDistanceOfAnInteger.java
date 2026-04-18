// Last updated: 4/18/2026, 11:53:47 AM
class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        for(int i=n;i>0;i/=10){
            rev=rev*10+i%10;
        }
        return Math.abs(rev-n);
        
    }
}