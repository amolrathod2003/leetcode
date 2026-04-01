// Last updated: 4/1/2026, 10:45:18 PM
class Solution {
    public String reverseWords(String s) {
        StringBuilder res=new StringBuilder();
        int end=s.length()-1;
        while(end>=0){
            if(s.charAt(end)==' '){
                end--;
                continue;
            }
            int start=end;
            while(start>=0 && s.charAt(start)!=' '){
                start--;
            }
            res.append(s.substring(start + 1, end + 1)).append(" ");
            end=start-1;
        }
        return res.toString().trim();

        
    }
}