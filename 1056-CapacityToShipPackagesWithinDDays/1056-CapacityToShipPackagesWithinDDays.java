// Last updated: 4/1/2026, 10:42:17 PM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = getMax(weights);
        int right = getSum(weights);
        int ans = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canShip(weights, days, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private int getMax(int[] weights) {
        int max = 0;
        for (int w : weights) {
            max = Math.max(max, w);
        }
        return max;
    }

    private int getSum(int[] weights) {
        int sum = 0;
        for (int w : weights) {
            sum += w;
        }
        return sum;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int d = 1;
        int load = 0;
        for (int w : weights) {
            if (load + w > capacity) {
                d++;
                load = 0;
            }
            load += w;
            if (d > days) return false;
        }
        return true;
    }
}
