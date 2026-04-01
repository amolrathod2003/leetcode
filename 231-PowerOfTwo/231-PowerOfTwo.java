// Last updated: 4/1/2026, 10:44:36 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n &(n-1))==0;
        
    }
}