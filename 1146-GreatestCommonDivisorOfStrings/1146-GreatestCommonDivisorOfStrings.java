// Last updated: 4/1/2026, 10:42:10 PM
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int l1=str1.length(),l2=str2.length();
        if(!(str1+str2).equals(str2+str1)){

        return "";
        }
        String res=str1.substring(0,gcd(l1,l2));
        return res;
        
    }
    private int gcd(int num1, int num2){
        if(num2==0){
            return num1;

        }
        return gcd(num2,num1%num2);
    }
}