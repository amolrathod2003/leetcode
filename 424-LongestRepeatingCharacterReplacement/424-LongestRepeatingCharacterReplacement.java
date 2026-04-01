// Last updated: 4/1/2026, 10:43:59 PM
class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,right=0;
        int maxlen=0,maxfre=0;
        int[] freq=new int[26];
        while(right<s.length()){
            char ch= s.charAt(right);
            freq[ch-'A']++;
            maxfre=Math.max(maxfre,freq[ch-'A']);
            if((right-left+1)-maxfre>k){
               freq[s.charAt(left) - 'A']--;
                left++;

            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
        
    }
}