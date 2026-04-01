// Last updated: 4/1/2026, 10:40:19 PM
class Solution {
    public int longestContinuousSubstring(String s) {
        int n=s.length();
        if(n==0) return 0;
        int maxLen=1;
        int curLen=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)-s.charAt(i-1)==1){
                curLen++;
            }else{
                curLen=1;
            }
            maxLen=Math.max(maxLen,curLen);
        }
        return maxLen;

        
    }
}