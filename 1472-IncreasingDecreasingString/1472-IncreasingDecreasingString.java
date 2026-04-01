// Last updated: 4/1/2026, 10:41:35 PM
class Solution {
    public String sortString(String s) {
        int[] cnt=new int[26];
        for(char c:s.toCharArray()){
            cnt[c-'a']++;
        }
        StringBuilder res=new StringBuilder();
        int totalChars=s.length();
        while(res.length()<totalChars){
            for(int i=0;i<26;i++){
                if(cnt[i]>0){
                    res.append((char)(i+'a'));
                    cnt[i]--;
                }
            }
            for(int i=25;i>=0;i--){
                if(cnt[i]>0){
                    res.append((char)(i+'a'));
                    cnt[i]--;

                }
            }
        }
        return res.toString();
        
    }
}