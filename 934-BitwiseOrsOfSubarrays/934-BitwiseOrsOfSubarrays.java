// Last updated: 4/1/2026, 10:42:38 PM
class Solution {
    public int subarrayBitwiseORs(int[] arr) {
       Set<Integer> res= new HashSet<>();
       Set<Integer> cur= new HashSet<>();
       for(int num:arr){
        Set<Integer> next=new HashSet<>();
        next.add(num);
        for(int val:cur){
            next.add(val| num);
        }
        cur=next;
        res.addAll(cur);
       }
       return res.size();

        
    }
}