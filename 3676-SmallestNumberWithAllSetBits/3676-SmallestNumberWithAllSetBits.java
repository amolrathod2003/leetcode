// Last updated: 4/1/2026, 10:39:35 PM
class Solution {
    public int smallestNumber(int n) {
        for(int i=0;i<=n;i++){
            int x=1<<i;
            if(x>n) return x-1;


        }
        return 0;
        
    }
}