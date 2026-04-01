// Last updated: 4/1/2026, 10:41:06 PM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder set1=new StringBuilder("");
        StringBuilder set2=new StringBuilder("");
        for(String val:word1){
            set1.append(val);
        }
        for(String val:word2){
            set2.append(val);
        }
        return set1.toString().equals(set2.toString());
        
    }
}