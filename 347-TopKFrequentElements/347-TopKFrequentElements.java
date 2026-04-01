// Last updated: 4/1/2026, 10:44:14 PM
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[1] - b[1]
        );

        for (int num : freqMap.keySet()) {
            pq.offer(new int[]{num, freqMap.get(num)});
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] result = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            result[i++] = pq.poll()[0];
        }

        return result;
    }
}
