// Last updated: 4/1/2026, 10:44:24 PM
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;

            }
            num=sum;
        }
        return num;
        
    }
}