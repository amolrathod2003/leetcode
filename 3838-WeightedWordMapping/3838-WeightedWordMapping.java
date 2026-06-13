// Last updated: 6/13/2026, 11:32:38 AM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder res=new StringBuilder();
4        for(String word:words){
5            int sum=0;
6            for(int i=0;i<word.length();i++){
7                char ch=word.charAt(i);
8                sum+=weights[ch-'a'];
9            }
10            int rem=sum%26;
11            char mappedChar=(char)('z'-rem);
12            res.append(mappedChar);
13        }
14        return res.toString();
15        
16    }
17}