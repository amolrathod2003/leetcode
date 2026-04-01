// Last updated: 4/1/2026, 10:44:46 PM

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++)
            adj.add(new ArrayList<>());
        int[] indegree = new int[numCourses];
        for(int[] p : prerequisites){
            int a = p[0];
            int b = p[1];
            adj.get(b).add(a); 
            indegree[a]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)
                q.add(i);
        }
        int count = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            count++;
            for(int neighbor : adj.get(node)){
                indegree[neighbor]--;
                if(indegree[neighbor]==0)
                    q.add(neighbor);
            }
        }
        return count == numCourses;
    }
}