// Last updated: 4/1/2026, 10:43:10 PM
class Solution {
    public int countBinarySubstrings(String s) {
        int prev=0;
        int cur=1;
        int res=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cur++;
            }else{
                res+=Math.min(prev,cur);
                prev=cur;
                cur=1;
            }
        }
        res+=Math.min(prev,cur);
        return res;
        
    }
}