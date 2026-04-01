// Last updated: 4/1/2026, 10:40:37 PM
import java.util.Arrays;

class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length;
        int m = grid[0].length;
        int[] FlattenedGrid = new int[n * m];
        int index = 0;
        int initialMod = grid[0][0] % x;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (grid[i][j] % x != initialMod) {
                    return -1;
                }
                FlattenedGrid[index++] = grid[i][j];
            }
        }
        Arrays.sort(FlattenedGrid);
        int median = FlattenedGrid[FlattenedGrid.length / 2];
        int operationCount = 0;
        for (int value : FlattenedGrid) {
            operationCount += Math.abs(value - median) / x;
        }

        return operationCount;
    }
}
