// Last updated: 6/1/2026, 9:02:09 AM
1class Solution {
2    public int minimumCost(int[] cost) {
3       Arrays.sort(cost);
4       int totalcost=0;
5       int n=cost.length;
6       for(int i=n-1;i>=0;i--){
7        if((n-1-i)%3 !=2){
8            totalcost+=cost[i];
9
10        }
11       }
12       return totalcost;
13        
14    }
15}