// Last updated: 6/16/2026, 9:17:24 AM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiaSq = 0;
        int maxArea = 0;
        for (int rec[] : dimensions) {
            int l = rec[0];
            int w = rec[1];
            int curDia = l * l + w * w;
            int curArea = l * w;
            if (curDia > maxDiaSq) {
                maxDiaSq = curDia;
                maxArea = curArea;
            } else if (curDia == maxDiaSq) {
                maxArea = Math.max(maxArea, curArea);
            }
        }
        return maxArea;
    }
}
