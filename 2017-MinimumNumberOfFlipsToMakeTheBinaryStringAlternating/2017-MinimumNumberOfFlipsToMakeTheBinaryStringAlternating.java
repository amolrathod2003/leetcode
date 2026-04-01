// Last updated: 4/1/2026, 10:40:48 PM
class Solution {
    public int minFlips(String s) {
        int n=s.length();
        s=s+s;
        char p[]=s.toCharArray();
        char a[]=new char[n+n];
        char b[]=new char[n+n];
        for(int i=0;i<n+n;i++){
            a[i]= (i%2==0) ? '1': '0';
            b[i]= (i%2==0) ? '0': '1';
            
        }
        int ans=99999999;
        int first=0,sec=0;
        for(int i=0;i<n+n;i++){
            if(a[i]!=p[i])
                ++first;
                if(b[i]!=p[i])
                    ++sec;
                if(i>=n) {
                    if(a[i-n]!=p[i-n]) --first;
                    if(b[i-n]!=p[i-n]) --sec;

                }
                if(i>=n-1){
                    ans=Math.min(ans,Math.min(first,sec));
                }
        }
        return ans;

        
    }
}