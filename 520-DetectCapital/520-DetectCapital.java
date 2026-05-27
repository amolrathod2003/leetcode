// Last updated: 5/27/2026, 12:23:52 PM
1class Solution {
2    public int numberOfSpecialChars(String word) {
3        boolean[] lowerSeen = new boolean[26];
4        boolean[] upperSeen = new boolean[26];
5        for (int i = 0; i < word.length(); i++) {
6            char ch = word.charAt(i);
7            if (ch >= 'a' && ch <= 'z') {
8                lowerSeen[ch - 'a'] = true;
9            } else if (ch >= 'A' && ch <= 'Z') {
10                upperSeen[ch - 'A'] = true;
11            }
12        }
13        int specialCount = 0;
14        for (int i = 0; i < 26; i++) {
15            if (lowerSeen[i] && upperSeen[i]) {
16                specialCount++;
17            }
18        }
19        return specialCount;
20    }
21}
22