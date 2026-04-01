// Last updated: 4/1/2026, 10:42:51 PM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;

            while (left <= right) {
                if (left == right) {
                    image[i][left] ^= 1;
                } else {
                    int temp = image[i][left] ^ 1;
                    image[i][left] = image[i][right] ^ 1;
                    image[i][right] = temp;
                }
                left++;
                right--;
            }
        }

        return image;
    }
}
