// Last updated: 4/1/2026, 10:39:07 PM
class Solution {
    public int minMoves(int[] nums) {
       int max=0;
        for(int n:nums) max=Math.max(max,n);
        int moves=0;
        for(int n:nums) moves+=max-n;
            return moves;
    }
}