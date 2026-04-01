// Last updated: 4/1/2026, 10:40:43 PM
class Solution {
    static class Pair {
        long first;
        int sec;
        Pair(long first, int sec) {
            this.first = first;
            this.sec = sec;
        }
    }
    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < roads.length; i++) {
            int u = roads[i][0];
            int v = roads[i][1];
            int time = roads[i][2];
            adj.get(u).add(new Pair(time, v));
            adj.get(v).add(new Pair(time, u));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (x, y) -> Long.compare(x.first, y.first)
        );

        long[] dist = new long[n];
        int[] ways = new int[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;
        ways[0] = 1;
        pq.add(new Pair(0, 0));
        int mod = (int)(1e9 + 7);
        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            long dis = current.first;
            int node = current.sec;
            if (dis > dist[node]) continue;
            for (Pair it : adj.get(node)) {
                long edgeWeight = it.first;
                int adjNode = it.sec;
                if (dis + edgeWeight < dist[adjNode]) {
                    dist[adjNode] = dis + edgeWeight;
                    pq.add(new Pair(dist[adjNode], adjNode));
                    ways[adjNode] = ways[node];
                } 
                else if (dis + edgeWeight == dist[adjNode]) {
                    ways[adjNode] = (ways[adjNode] + ways[node]) % mod;
                }
            }
        }
        return ways[n - 1];
    }
}