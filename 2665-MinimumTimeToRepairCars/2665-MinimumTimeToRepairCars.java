// Last updated: 4/1/2026, 10:40:10 PM
class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left = 1;  
        long right = (long) ranks[0] * cars * cars;  
        while (left < right) {
            long mid = left + (right - left) / 2;  
            long count = 0;
            for (int rank : ranks) {
                count += (long) Math.floor(Math.sqrt(mid / rank)); 
            }
            if (count >= cars) {
                right = mid;
            } else {
                left = mid + 1;  
            }
        }
        return left;  
    }
}
