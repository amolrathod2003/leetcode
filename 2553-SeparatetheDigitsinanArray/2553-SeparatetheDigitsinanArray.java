// Last updated: 5/11/2026, 9:42:55 AM
1class Solution {
2    public int[] separateDigits(int[] nums) {
3        List<Integer>ls=new ArrayList<>();
4        for(int num:nums){
5             List<Integer> temp=new ArrayList<>();
6             while(num>0){
7                int dig=num%10;
8                temp.add(dig);
9                num=num/10;
10
11             }
12             Collections.reverse(temp);
13             ls.addAll(temp);
14
15        }
16         int[] result = new int[ls.size()];
17         for(int i=0;i<ls.size();i++){
18            result[i]=ls.get(i);
19         }
20         return result;
21        
22    }
23}