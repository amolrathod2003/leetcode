// Last updated: 5/12/2026, 1:57:24 PM
1class Solution {
2    public int reverse(int x) {
3        int rev = 0;
4        while (x != 0) {
5            int dig = x % 10;
6            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
7                return 0;
8            }
9            rev = rev * 10 + dig;
10            x = x / 10;
11        }
12
13        return rev;
14    }
15}