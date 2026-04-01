// Last updated: 4/1/2026, 10:41:27 PM
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int total=0;
        for(int point:cardPoints){
            total+=point;
        }
        if(k==n)
        return total;
        int windowsize=n-k;
        int cur=0;
        for(int i=0;i<windowsize;i++){
            cur+=cardPoints[i];

        }
        int min=cur;
        for(int i=windowsize;i<n;i++){
            cur+=cardPoints[i]-cardPoints[i-windowsize];
            min = Math.min(min,cur);
        }
        return total-min;
    }
}