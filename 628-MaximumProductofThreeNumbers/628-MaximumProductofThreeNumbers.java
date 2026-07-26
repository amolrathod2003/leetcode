// Last updated: 7/26/2026, 9:28:29 AM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        int max1 = Integer.MIN_VALUE;
4        int max2 = Integer.MIN_VALUE;
5        int max3 = Integer.MIN_VALUE;
6        int min1 = Integer.MAX_VALUE;
7        int min2 = Integer.MAX_VALUE;
8        for (int n : nums) {
9            if (n > max1) {
10                max3 = max2;
11                max2 = max1;
12                max1 = n;
13            } else if (n > max2) {
14                max3 = max2;
15                max2 = n;
16            } else if (n > max3) {
17                max3 = n;
18            } 
19            if (n < min1) {
20                min2 = min1;
21                min1 = n;
22            } else if (n < min2) {
23                min2 = n;
24            }
25        }
26        int product1 = max1 * max2 * max3;
27        int product2 = min1 * min2 * max1;
28        return Math.max(product1, product2);
29    }
30}
31