// Last updated: 4/1/2026, 10:42:47 PM
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double[][] cars=new double[n][2];
        for(int i=0;i<n;i++){
            double time=(double)(target-position[i])/speed[i];
            cars[i][0]=position[i];
            cars[i][1]=time;
        }
        Arrays.sort(cars,(a,b)->Double.compare(b[0],a[0]));
        int fleet=0;
        double pre=0;
        for(int i=0;i<n;i++){
            double cur=cars[i][1];
            if(cur>pre){
                fleet++;
                pre=cur;
            }
        }
        return fleet;
        
    }
}