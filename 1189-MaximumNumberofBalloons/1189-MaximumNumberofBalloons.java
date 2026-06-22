// Last updated: 6/22/2026, 9:17:25 AM
1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        int[] cnt = new int[26];
4        for (int i = 0; i < text.length(); i++) {
5            cnt[text.charAt(i) - 'a']++;
6        }
7        int bcnt = cnt['b' - 'a'];
8        int acnt = cnt['a' - 'a'];
9        int lcnt = cnt['l' - 'a'] / 2;
10        int ocnt = cnt['o' - 'a'] / 2;
11        int ncnt = cnt['n' - 'a'];
12        return Math.min(bcnt,
13               Math.min(acnt,
14               Math.min(lcnt,
15               Math.min(ocnt, ncnt))));
16    }
17}
18