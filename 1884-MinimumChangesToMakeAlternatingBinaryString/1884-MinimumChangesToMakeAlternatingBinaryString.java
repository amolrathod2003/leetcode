// Last updated: 4/1/2026, 10:40:58 PM
class Solution {
    public int minOperations(String s) {
        int sWith0=0;
        int sWith1=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='0'){
                    sWith1++;
                }else{
                    sWith0++;
                }
            }
            else {
                if(s.charAt(i)=='1'){
                    sWith1++;
                }else{
                    sWith0++;
                }
            }
        }
        return Math.min(sWith0,sWith1);
        
    }
}