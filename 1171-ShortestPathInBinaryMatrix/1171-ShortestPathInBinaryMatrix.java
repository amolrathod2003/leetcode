// Last updated: 4/1/2026, 10:42:04 PM
import java.util.*;

class Tuple {
    int dist, row, col;

    public Tuple(int dist, int row, int col) {
        this.dist = dist;
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n-1][n-1] == 1)
            return -1;
        Queue<Tuple> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        q.add(new Tuple(1, 0, 0));
        visited[0][0] = true;
        int[] dr = {-1,-1,-1,0,0,1,1,1};
        int[] dc = {-1,0,1,-1,1,-1,0,1};
        while (!q.isEmpty()) {
            Tuple curr = q.poll();
            int dist = curr.dist;
            int r = curr.row;
            int c = curr.col;
            if (r == n - 1 && c == n - 1)
                return dist;
            for (int i = 0; i < 8; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (nr >= 0 && nc >= 0 && nr < n && nc < n &&
                    !visited[nr][nc] && grid[nr][nc] == 0) {

                    visited[nr][nc] = true;
                    q.add(new Tuple(dist + 1, nr, nc));
                }
            }
        }
        return -1;
    }
}