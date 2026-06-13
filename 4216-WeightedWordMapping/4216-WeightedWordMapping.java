// Last updated: 6/13/2026, 12:51:41 PM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res=new StringBuilder();
        for(String word:words){
            int sum=0;
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                sum+=weights[ch-'a'];
            }
            int rem=sum%26;
            char mappedChar=(char)('z'-rem);
            res.append(mappedChar);
        }
        return res.toString();
        
    }
}