// Last updated: 4/1/2026, 10:40:55 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int lenword1 = word1.length(), lenword2 = word2.length();
        StringBuilder mergestring = new StringBuilder(); 
        for (int i = 0; i < lenword1 || i < lenword2; ++i) {
            if (i < lenword1) {
                mergestring.append(word1.charAt(i));
            }
            if (i < lenword2) {
                mergestring.append(word2.charAt(i));
            }
        }
        return mergestring.toString(); 
    }
}
