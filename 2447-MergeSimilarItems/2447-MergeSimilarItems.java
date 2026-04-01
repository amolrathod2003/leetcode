// Last updated: 4/1/2026, 10:40:22 PM
import java.util.*;

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] item : items1) {
            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }
        for (int[] item : items2) {
            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> item = new ArrayList<>();
            item.add(entry.getKey());
            item.add(entry.getValue());
            result.add(item);
        }
        Collections.sort(result, (a, b) -> Integer.compare(a.get(0), b.get(0)));

        return result;
    }
}
