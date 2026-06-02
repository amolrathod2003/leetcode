// Last updated: 6/2/2026, 12:49:08 PM
1class Solution {
2    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
3        int minFinishTime=Integer.MAX_VALUE;
4        for(int i=0;i<landStartTime.length;i++){
5            for(int j=0;j<waterStartTime.length;j++){
6                int startLand = landStartTime[i];
7                int endLand = startLand + landDuration[i];
8                int startWater = Math.max(waterStartTime[j], endLand);
9                int endWater = startWater + waterDuration[j];
10                minFinishTime = Math.min(minFinishTime, endWater);
11                int startWaterFirst = waterStartTime[j];
12                int endWaterFirst = startWaterFirst + waterDuration[j];
13                int startLandSecond = Math.max(landStartTime[i], endWaterFirst);
14                int endLandSecond = startLandSecond + landDuration[i];
15                minFinishTime = Math.min(minFinishTime, endLandSecond);
16            }
17        }
18        return minFinishTime;
19        
20    }
21}