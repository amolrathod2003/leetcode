// Last updated: 4/1/2026, 10:43:08 PM
class Solution {
    private void dfs(int r, int c, int[][] img, int oldColor, int newColor) {
        int n = img.length;
        int m = img[0].length;
        if (r < 0 || c < 0 || r >= n || c >= m || img[r][c] != oldColor)
            return;
        img[r][c] = newColor;
        dfs(r - 1, c, img, oldColor, newColor);
        dfs(r + 1, c, img, oldColor, newColor);
        dfs(r, c - 1, img, oldColor, newColor);
        dfs(r, c + 1, img, oldColor, newColor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor == newColor)
            return image;
        dfs(sr, sc, image, oldColor, newColor);
        return image;
    }
}
