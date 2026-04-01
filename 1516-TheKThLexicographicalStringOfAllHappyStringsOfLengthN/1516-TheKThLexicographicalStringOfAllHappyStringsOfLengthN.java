// Last updated: 4/1/2026, 10:41:30 PM
class Solution {
    int cnt=0;
    String ans="";
    public void find(int n,int k,StringBuilder sb){
        if(ans.length()>0) return;
        if(sb.length()==n){
            cnt++;
            if(cnt==k){
                ans=sb.toString();
            }
            return;
        }
    for(char ch:new char[]{'a','b','c'}){
        if(sb.length()==0 || sb.charAt(sb.length()-1)!=ch){
            sb.append(ch);
            find(n,k,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        }
    }
    public String getHappyString(int n, int k) {
        find(n,k,new StringBuilder());
        return ans;
    }
}