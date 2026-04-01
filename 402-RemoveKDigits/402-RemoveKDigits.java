// Last updated: 4/1/2026, 10:44:05 PM
class Solution {
    public String removeKdigits(String num, int k) {
        int i;
        if(k==0)
        return num;
        if(k==num.length())
            return "0";
            Stack<Character> st=new Stack<>();
            int len = num.length();
            st.push(num.charAt(0));
            for(i=1;i<len;i++){
                while(!st.isEmpty()&&k>0&&st.peek()>num.charAt(i)){
                    st.pop();
                    k--;
                }
                st.push(num.charAt(i));
            }
            while(k>0){
                st.pop();
                k--;
            }
            StringBuilder sb=new StringBuilder();
            while(!st.isEmpty()) {
                sb.append(st.peek());
                st.pop();
            }
            sb.reverse();
            i=0;
            while(i<sb.length()&&sb.charAt(i)=='0')
                i++;
                if(sb.toString().substring(i).length()!=0)
                return sb.toString().substring(i);
                else
              return "0";
       
    }
}