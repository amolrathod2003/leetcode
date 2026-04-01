// Last updated: 4/1/2026, 10:40:21 PM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int wc = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                wc++;
            }
        }
        int minc = wc; 
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W') {
                wc--;
            }
            if (blocks.charAt(i) == 'W') {
                wc++;
            }
            minc = Math.min(minc, wc);
        }
        return minc; 
        
    }
}