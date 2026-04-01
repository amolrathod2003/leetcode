// Last updated: 4/1/2026, 10:44:50 PM
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] isComposite = new boolean[n];
        for (int i = 2; i * i < n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) cnt++;
        }
        return cnt;
    }
}
