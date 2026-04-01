// Last updated: 4/1/2026, 10:40:23 PM
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length;
        int m=potions.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            long spell=spells[i];
            long reqpos=(success+spell-1)/spell;
            int ind=bs(potions,reqpos);
            res[i]=m-ind;
        }
        return res;
    }
    private int bs(int[] potions,long tar){
        int left=0,right=potions.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(potions[mid]<tar){
                left=mid+1;
            }else{
                right=mid-1;
            }

        }
        return left;
    }
}