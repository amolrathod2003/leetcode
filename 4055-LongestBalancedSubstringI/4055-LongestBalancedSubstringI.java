// Last updated: 4/1/2026, 10:39:16 PM
class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int ans=1;
        for(int i=0;i<n;i++){
            int[] freq=new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                if(isBalanced(freq)){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
    private boolean isBalanced(int[] freq){
        int cnt=0;
        for(int f:freq){
            if(f>0){
                if(cnt==0){
                    cnt=f;

                }
                else if(f!=cnt){
                    return false;
                }
            }
        }
        return true;
    }
}