// Last updated: 4/1/2026, 10:41:09 PM
class Solution {
    public int maxDepth(String s) {
        int maxDepth=0;
        int curDepth=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                curDepth++;
                maxDepth=Math.max(maxDepth,curDepth);
            }else if(c==')'){
                curDepth--;
            }
        }
        return maxDepth;

    }
}