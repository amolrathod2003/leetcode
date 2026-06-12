// Last updated: 6/12/2026, 12:29:42 PM
1class Solution {
2    public boolean checkRecord(String s) {
3       int absentCount=0;
4       for(int i=0;i<s.length();i++){
5        if(s.charAt(i)=='A'){
6            absentCount++;
7            if(absentCount>=2){
8                return false;
9            }
10        }
11       }
12       return !s.contains("LLL");
13    }
14}