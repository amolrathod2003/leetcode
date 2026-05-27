// Last updated: 5/27/2026, 11:45:56 AM
1class Solution {
2    public boolean detectCapitalUse(String word) {
3        if(word.equals(word.toUpperCase())){
4            return true;
5        }
6        if(word.equals(word.toLowerCase())){
7            return true;
8        }
9        String remLet=word.substring(1);
10        if(Character.isUpperCase(word.charAt(0))&& remLet.equals(remLet.toLowerCase())){
11            return true;
12        }
13        return false;
14
15    }
16}