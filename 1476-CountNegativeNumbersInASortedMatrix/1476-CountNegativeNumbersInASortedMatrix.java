// Last updated: 4/1/2026, 10:41:33 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int cnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}