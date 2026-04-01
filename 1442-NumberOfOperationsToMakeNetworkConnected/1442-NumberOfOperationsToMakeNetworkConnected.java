// Last updated: 4/1/2026, 10:41:41 PM
class DisjointSet {
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    public DisjointSet(int n) {
        for (int i = 0; i < n; i++) {
            parent.add(i);
            size.add(1);
        }
    }
    public int findUpar(int node) {
        if (node == parent.get(node)) return node;
        int ulp = findUpar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }
    public void unionBySize(int u, int v) {
        int pu = findUpar(u);
        int pv = findUpar(v);
        if (pu == pv) return;
        if (size.get(pu) < size.get(pv)) {
            parent.set(pu, pv);
            size.set(pv, size.get(pv) + size.get(pu));
        } else {
            parent.set(pv, pu);
            size.set(pu, size.get(pu) + size.get(pv));
        }
    }
}
class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) return -1;
        DisjointSet ds = new DisjointSet(n);
        int extraCnt = 0;
        for (int i = 0; i < connections.length; i++) {
            int u = connections[i][0];
            int v = connections[i][1];
            if (ds.findUpar(u) == ds.findUpar(v)) {
                extraCnt++;
            } else {
                ds.unionBySize(u, v);
            }
        }
        int components = 0;
        for (int i = 0; i < n; i++) {
            if (ds.findUpar(i) == i) components++;
        }
        int needed = components - 1;
        if (extraCnt >= needed) return needed;
        return -1;
    }
}