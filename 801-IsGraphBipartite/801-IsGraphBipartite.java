// Last updated: 4/1/2026, 10:42:57 PM

class Solution {
    private boolean check(int start, int[][] graph, int[] color){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int neigh : graph[node]){
                if(color[neigh] == -1){
                    color[neigh] = 1 - color[node];
                    q.add(neigh);
                }
                else if(color[neigh] == color[node]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;
        int[] color = new int[V];
        Arrays.fill(color, -1);

        for(int i=0;i<V;i++){
            if(color[i] == -1){
                if(!check(i, graph, color))
                    return false;
            }
        }
        return true;
    }
}