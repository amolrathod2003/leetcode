// Last updated: 4/1/2026, 10:39:57 PM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
         int n = grid.length;
        int size = n * n;
        int[] arr = new int[size];
        for (int i= 0;i<grid.length;i++) {
            for (int j =0;j<grid[i].length; j++) {
                arr[grid[i][j]-1]++;  
            }
        }
       int repeat = -1;  
        int missing = -1; 
        for (int i= 0;i<size;i++) {
            if (arr[i]==2) {
                repeat = i +1; 
            } else if (arr[i] == 0) {
                missing = i + 1;  
            }
        }
        return new int[]{repeat, missing};
    }
}