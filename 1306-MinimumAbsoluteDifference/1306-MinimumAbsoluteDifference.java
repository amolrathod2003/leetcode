// Last updated: 4/1/2026, 10:41:51 PM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int minDif=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            minDif=Math.min(minDif,arr[i]-arr[i-1]);
        }
        List<List<Integer>>res=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1]==minDif){
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return res;

        
    }
}