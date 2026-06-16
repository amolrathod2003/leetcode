// Last updated: 6/16/2026, 9:16:38 AM
1class Solution {
2    public String processStr(String s) {
3        StringBuilder res=new StringBuilder();
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(Character.isLowerCase(ch)){
7                res.append(ch);
8            }else if(ch == '*'){
9                if(res.length()>0){
10                    res.deleteCharAt(res.length()-1);
11                }
12            }else if(ch == '#'){
13                res.append(res.toString());
14            }else if(ch == '%'){
15                res.reverse();
16            }
17        }
18        return res.toString();
19        
20    }
21}