// Last updated: 4/1/2026, 10:39:51 PM
class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        int k=0;
        for(char ch:t.toCharArray())
        map.put(ch,k++);
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum +=Math.abs(i-map.get(s.charAt(i)));
        }
        return sum;
        
    }
}