// Last updated: 4/1/2026, 10:40:04 PM
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String>res=new ArrayList<>();
        for(int i=0;i<words.size();i++){
            String wordsArray[]=words.get(i).split("["+separator+"]");
            for(String word : wordsArray){
                if(word!=""){
                    res.add(word);
                }
            }
            
        }
        return res;
        
    }
}