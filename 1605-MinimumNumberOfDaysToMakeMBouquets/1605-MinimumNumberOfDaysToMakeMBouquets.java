// Last updated: 4/1/2026, 10:41:21 PM
class Solution {
    public int getNoofBouquets(int[] bloomDay, int mid, int k) {
        int nbouquets = 0;
        int cnt = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= mid) {
                cnt++;
                if (cnt == k) {
                    nbouquets++;
                    cnt = 0;
                }
            } else {
                cnt = 0;
            }
        }
        return nbouquets;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            left = Math.min(left, day);
            right = Math.max(right, day);
        }
        int minDays = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (getNoofBouquets(bloomDay, mid, k) >= m) {
                minDays = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return minDays;
    }
}
