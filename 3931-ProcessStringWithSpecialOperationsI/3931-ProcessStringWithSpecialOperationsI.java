// Last updated: 6/16/2026, 9:17:05 AM
class Solution {
    public String processStr(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch)){
                res.append(ch);
            }else if(ch == '*'){
                if(res.length()>0){
                    res.deleteCharAt(res.length()-1);
                }
            }else if(ch == '#'){
                res.append(res.toString());
            }else if(ch == '%'){
                res.reverse();
            }
        }
        return res.toString();
        
    }
}