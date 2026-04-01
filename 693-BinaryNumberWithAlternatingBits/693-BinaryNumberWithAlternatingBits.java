// Last updated: 4/1/2026, 10:43:11 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x=n^(n>>1);
        return (x & (x+1))==0;

        
    }
}