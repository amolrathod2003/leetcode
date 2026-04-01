// Last updated: 4/1/2026, 10:40:54 PM
class Solution {
    public boolean checkOnesSegment(String s) {
        int n=s.length();
        for(int i=1;i<n;i++){
            if(s.charAt(i-1)=='0' && s.charAt(i)=='1'){
                return false;
            }
        }
        return true;
        
    }
}