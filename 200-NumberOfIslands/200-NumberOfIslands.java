// Last updated: 4/1/2026, 10:44:52 PM
import java.util.*;
class Pair {
    int r, c;
    Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j] && grid[i][j] == '1') {
                    bfs(i, j, vis, grid);
                    count++;
                }
            }
        }
        return count;
    }
    private void bfs(int r, int c, boolean[][] vis, char[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(r, c));
        vis[r][c] = true;
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        while (!q.isEmpty()) {
            Pair p = q.poll();
            for (int i = 0; i < 4; i++) {
                int nr = p.r + dr[i];
                int nc = p.c + dc[i];
                if (nr >= 0 && nc >= 0 &&
                    nr < grid.length && nc < grid[0].length &&
                    grid[nr][nc] == '1' && !vis[nr][nc]) {
                    vis[nr][nc] = true;
                    q.add(new Pair(nr, nc));
                }
            }
        }
    }
}
