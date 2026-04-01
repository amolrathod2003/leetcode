// Last updated: 4/1/2026, 10:43:09 PM
class Solution {
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
        int find(int x) {
            if (parent[x] != x)
                parent[x] = find(parent[x]);
            return parent[x];
        }
        void union(int x, int y) {
            int px = find(x);
            int py = find(y);

            if (px == py) return;

            if (size[px] < size[py]) {
                parent[px] = py;
                size[py] += size[px];
            } else {
                parent[py] = px;
                size[px] += size[py];
            }
        }
    }
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();
        DisjointSet ds = new DisjointSet(n);
        Map<String, Integer> emailMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < accounts.get(i).size(); j++) {
                String email = accounts.get(i).get(j);
                if (!emailMap.containsKey(email)) {
                    emailMap.put(email, i);
                } else {
                    ds.union(i, emailMap.get(email));
                }
            }
        }
        Map<Integer, TreeSet<String>> merged = new HashMap<>();
        for (String email : emailMap.keySet()) {
            int parent = ds.find(emailMap.get(email));
            merged.putIfAbsent(parent, new TreeSet<>());
            merged.get(parent).add(email);
        }
        List<List<String>> result = new ArrayList<>();
        for (int parent : merged.keySet()) {
            List<String> list = new ArrayList<>();
            list.add(accounts.get(parent).get(0));
            list.addAll(merged.get(parent));
            result.add(list);
        }
        return result;
    }
}