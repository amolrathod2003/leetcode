// Last updated: 4/1/2026, 10:43:55 PM
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freqmap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqmap.put(ch, freqmap.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxheap =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxheap.addAll(freqmap.entrySet());

        StringBuilder res = new StringBuilder();
        while (!maxheap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxheap.poll();
            char ch = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                res.append(ch);
            }
        }

        return res.toString();
    }
}
