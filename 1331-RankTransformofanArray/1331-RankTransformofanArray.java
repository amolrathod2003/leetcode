// Last updated: 7/12/2026, 9:07:22 AM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int[] sortUniqe=Arrays.stream(arr).distinct().sorted().toArray();
4        Map<Integer,Integer>rankedmap=new HashMap<>();
5        for(int i=0;i<sortUniqe.length;i++){
6            rankedmap.put(sortUniqe[i],i+1);
7        }
8        int[] res=new int[arr.length];
9        for(int i=0;i<arr.length;i++){
10            res[i]=rankedmap.get(arr[i]);
11        }
12        return res;
13        
14        
15    }
16}