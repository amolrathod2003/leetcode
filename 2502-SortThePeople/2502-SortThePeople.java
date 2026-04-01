// Last updated: 4/1/2026, 10:40:18 PM
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int numofPeople=names.length;
        Integer[] indices=new Integer[numofPeople];
        for(int i=0;i<numofPeople;++i){
            indices[i]=i;

        } 
        Arrays.sort(indices,(i,j)->heights[j]-heights[i]);
        String[] sortedNames=new String[numofPeople];
        for(int i=0;i<numofPeople;++i){
            sortedNames[i]=names[indices[i]];
        }
        return sortedNames;
        
    }
}