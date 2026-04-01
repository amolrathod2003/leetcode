// Last updated: 4/1/2026, 10:42:32 PM
class Solution {
    public int minAddToMakeValid(String s) {
        int addReq=0;
        int bCount=0;
        for(char character:s.toCharArray()){

        if(character=='('){
            bCount++;
        } 
        else if(bCount>0){
            bCount--;

        }else{

        addReq++;
        }
     }
     addReq+=bCount;
     return addReq;
        
    }
}