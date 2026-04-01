// Last updated: 4/1/2026, 10:42:26 PM
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
    public int removeStones(int[][] stones) {
        int n = stones.length;
        int maxRow = 0, maxCol = 0;
        for (int i = 0; i < n; i++) {
            maxRow = Math.max(maxRow, stones[i][0]);
            maxCol = Math.max(maxCol, stones[i][1]);
        }
        DisjointSet ds = new DisjointSet(maxRow + maxCol + 2);
        HashSet<Integer> nodes = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int nodeRow = stones[i][0];
            int nodeCol = stones[i][1] + maxRow + 1;
            ds.unionBySize(nodeRow, nodeCol);
            nodes.add(nodeRow);
            nodes.add(nodeCol);
        }
        int components = 0;
        for (int node : nodes) {
            if (ds.findUpar(node) == node)
                components++;
        }
        return n - components;
    }
}