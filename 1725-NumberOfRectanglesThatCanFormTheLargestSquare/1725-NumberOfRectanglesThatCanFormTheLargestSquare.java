// Last updated: 6/15/2026, 10:10:32 AM
1class Solution {
2    public int countGoodRectangles(int[][] rectangles) {
3        int maxlen=0;
4        int cnt=0;
5        for(int[] rec: rectangles){
6            int curMaxSq=Math.min(rec[0],rec[1]);
7            if(curMaxSq>maxlen){
8                maxlen=curMaxSq;
9                cnt=1;
10            }else if(curMaxSq==maxlen){
11                cnt++;
12            }
13        }
14        return cnt;
15        
16    }
17}