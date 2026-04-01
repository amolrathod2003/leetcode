// Last updated: 4/1/2026, 10:39:17 PM
class Solution {
    public long removeZeros(long n) {
       String str = Long.toString(n);
        str=str.replaceAll("0","");
       return Long.parseLong(str);
        
    }
}