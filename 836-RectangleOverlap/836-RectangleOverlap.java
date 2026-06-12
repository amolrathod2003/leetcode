// Last updated: 6/12/2026, 12:23:38 PM
1class Solution {
2    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
3        int area1 = (ax2 - ax1) * (ay2 - ay1);
4        int area2 = (bx2 - bx1) * (by2 - by1);
5        int overlapedWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
6        int overlapedHeight = Math.min(ay2, by2) - Math.max(ay1, by1);
7        int overlapedArea = 0;
8        if (overlapedWidth > 0 && overlapedHeight > 0) {
9            overlapedArea = overlapedWidth * overlapedHeight;
10        }
11        return area1 + area2 - overlapedArea;
12    }
13}