// Last updated: 4/1/2026, 10:42:44 PM
class Solution {
    public int binaryGap(int n) {
        int last = -1;
        int pos = 0;
        int maxDist = 0;
        while(n > 0){
            if((n & 1) == 1){
                if(last != -1){
                    maxDist = Math.max(maxDist, pos - last);
                }
                last = pos;
            }
            pos++;
            n >>= 1;
        }
        return maxDist;
    }
}