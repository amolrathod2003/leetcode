// Last updated: 6/13/2026, 12:52:07 PM
import java.util.HashSet;

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> prefixes = new HashSet<>();
        int maxlen = 0;
        for (int num : arr1) {
            while (num > 0) {  
                prefixes.add(num);
                num /= 10;
            }
        }
        for (int num : arr2) {
            while (num > 0) {
                if (prefixes.contains(num)) {
                    int curlen = String.valueOf(num).length();
                    maxlen = Math.max(maxlen, curlen);
                    break;
                }
                num /= 10;
            }
        }
        return maxlen;
    }
}
