// Last updated: 4/1/2026, 10:42:52 PM
class DisjointSet {
    int[] parent, size;
    DisjointSet(int n) {
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }
    int findUpar(int node) {
        if (node == parent[node]) return node;
        return parent[node] = findUpar(parent[node]);
    }
    void unionBySize(int u, int v) {
        int pu = findUpar(u);
        int pv = findUpar(v);
        if (pu == pv) return;
        if (size[pu] < size[pv]) {
            parent[pu] = pv;
            size[pv] += size[pu];
        } else {
            parent[pv] = pu;
            size[pu] += size[pv];
        }
    }
}
class Solution {
    private boolean isValid(int r, int c, int n) {
        return r >= 0 && c >= 0 && r < n && c < n;
    }
    public int largestIsland(int[][] grid) {
        int n = grid.length;
        DisjointSet ds = new DisjointSet(n * n);
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == 0) continue;
                for (int i = 0; i < 4; i++) {
                    int nr = row + dr[i];
                    int nc = col + dc[i];
                    if (isValid(nr, nc, n) && grid[nr][nc] == 1) {
                        int node = row * n + col;
                        int adj = nr * n + nc;
                        ds.unionBySize(node, adj);
                    }
                }
            }
        }
        int max = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == 1) continue;
                HashSet<Integer> set = new HashSet<>();
                for (int i = 0; i < 4; i++) {
                    int nr = row + dr[i];
                    int nc = col + dc[i];
                    if (isValid(nr, nc, n) && grid[nr][nc] == 1) {
                        set.add(ds.findUpar(nr * n + nc));
                    }
                }
                int total = 1;
                for (int parent : set) {
                    total += ds.size[parent];
                }
                max = Math.max(max, total);
            }
        }
        for (int i = 0; i < n * n; i++) {
            max = Math.max(max, ds.size[ds.findUpar(i)]);
        }
        return max;
    }
}