// Last updated: 5/21/2026, 12:16:05 PM
1import java.util.HashSet;
2
3class Solution {
4    public int longestCommonPrefix(int[] arr1, int[] arr2) {
5        HashSet<Integer> prefixes = new HashSet<>();
6        int maxlen = 0;
7        for (int num : arr1) {
8            while (num > 0) {  
9                prefixes.add(num);
10                num /= 10;
11            }
12        }
13        for (int num : arr2) {
14            while (num > 0) {
15                if (prefixes.contains(num)) {
16                    int curlen = String.valueOf(num).length();
17                    maxlen = Math.max(maxlen, curlen);
18                    break;
19                }
20                num /= 10;
21            }
22        }
23        return maxlen;
24    }
25}
26