// Last updated: 4/1/2026, 10:41:32 PM
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        outer:for(int val1:arr1){
            for(int val2:arr2){
                if(Math.abs(val1-val2)<=d){
                    continue outer;
                }
            }
            count++;

        }
        return count;
       
        
    }
}