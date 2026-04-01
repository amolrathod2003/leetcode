// Last updated: 4/1/2026, 10:41:49 PM
class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left=1,right=10_000_000;
        int result=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            long cc=0;
            for(int candy:candies){
                cc +=candy/mid;

            }
            if(cc>=k){
                result=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return result;
                
    }
}