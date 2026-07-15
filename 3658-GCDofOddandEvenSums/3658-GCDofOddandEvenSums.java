// Last updated: 7/15/2026, 4:43:32 PM
1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3        long sumOdd = (long) n * n;
4        long sumEven = (long) n * (n + 1);
5        return (int) computeGcd(sumOdd, sumEven);
6    }
7
8    private long computeGcd(long a, long b) {
9        while (b != 0) {
10            long temp = b;
11            b = a % b;
12            a = temp;
13        }
14        return a;
15    }
16}
17