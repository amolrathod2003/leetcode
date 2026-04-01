// Last updated: 4/1/2026, 10:40:46 PM
class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        for(int i=n-1;i>=0;i--){
            char c=num.charAt(i);
            if((c-'0')%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}