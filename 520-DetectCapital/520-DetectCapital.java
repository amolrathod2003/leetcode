// Last updated: 5/27/2026, 12:03:55 PM
1class Solution {
2    public boolean detectCapitalUse(String word) {
3         return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]*");
4    }
5}