// Last updated: 4/1/2026, 10:41:18 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
           int newBottels=empty/numExchange;
            total+=newBottels;
            empty=empty%numExchange+newBottels;
        }
        return total;


        
    }
}