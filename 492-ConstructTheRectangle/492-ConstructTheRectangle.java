// Last updated: 4/1/2026, 10:43:50 PM
class Solution {
    public int[] constructRectangle(int area) {
        int sp=(int)Math.sqrt(area);
        for(int i=sp;i>=1;i--){
            if(area%i==0){
                return new int[]{area/i,i};
            }
        }
        return new int[]{area,1};
        
    }
}