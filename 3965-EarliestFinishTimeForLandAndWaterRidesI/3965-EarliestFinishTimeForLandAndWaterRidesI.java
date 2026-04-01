// Last updated: 4/1/2026, 10:39:20 PM
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minFinishTime=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int startLand = landStartTime[i];
                int endLand = startLand + landDuration[i];
                int startWater = Math.max(waterStartTime[j], endLand);
                int endWater = startWater + waterDuration[j];
                minFinishTime = Math.min(minFinishTime, endWater);
                int startWaterFirst = waterStartTime[j];
                int endWaterFirst = startWaterFirst + waterDuration[j];
                int startLandSecond = Math.max(landStartTime[i], endWaterFirst);
                int endLandSecond = startLandSecond + landDuration[i];
                minFinishTime = Math.min(minFinishTime, endLandSecond);
            }
        }
        return minFinishTime;
        
    }
}