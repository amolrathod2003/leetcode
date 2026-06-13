// Last updated: 6/13/2026, 12:14:07 PM
1class RecentCounter {
2    private Queue<Integer> req;
3
4    public RecentCounter() {
5        req=new LinkedList<>();
6        
7    }
8    
9    public int ping(int t) {
10        req.add(t);
11        while (!req.isEmpty() && req.peek() < t - 3000) {
12            req.poll();
13        }
14        return req.size();
15        
16    }
17}
18
19/**
20 * Your RecentCounter object will be instantiated and called as such:
21 * RecentCounter obj = new RecentCounter();
22 * int param_1 = obj.ping(t);
23 */