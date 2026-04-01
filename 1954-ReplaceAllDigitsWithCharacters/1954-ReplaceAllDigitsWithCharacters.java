// Last updated: 4/1/2026, 10:40:52 PM
class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(i % 2 == 1) {
                char cm = s.charAt(i-1);
                sb.append((char)(cm + (ch - '0')));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}