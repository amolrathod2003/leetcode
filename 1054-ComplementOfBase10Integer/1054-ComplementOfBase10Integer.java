// Last updated: 4/1/2026, 10:42:18 PM
class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;

        }
        int no=0;
        int power=0;
        while(no<n){
            no+=Math.pow(2,power);
            power++;
        }
        return no-n;
        
    }
}