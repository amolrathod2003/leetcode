// Last updated: 6/13/2026, 6:11:00 PM
1class Solution {
2    public int areaOfMaxDiagonal(int[][] dimensions) {
3        int maxDiaSq = 0;
4        int maxArea = 0;
5        for (int rec[] : dimensions) {
6            int l = rec[0];
7            int w = rec[1];
8            int curDia = l * l + w * w;
9            int curArea = l * w;
10            if (curDia > maxDiaSq) {
11                maxDiaSq = curDia;
12                maxArea = curArea;
13            } else if (curDia == maxDiaSq) {
14                maxArea = Math.max(maxArea, curArea);
15            }
16        }
17        return maxArea;
18    }
19}
20