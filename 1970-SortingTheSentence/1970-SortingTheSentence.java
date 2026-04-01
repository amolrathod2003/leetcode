// Last updated: 4/1/2026, 10:40:51 PM
class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        String[] sortedWords=new String[words.length];
        for(String word:words){
           int index = word.charAt(word.length() - 1) - '1';
            sortedWords[index]=word.substring(0,word.length()-1);
            sortedWords[index]=word.substring(0,word.length()-1);

        }
        return String.join(" ",sortedWords);

        
    }
}