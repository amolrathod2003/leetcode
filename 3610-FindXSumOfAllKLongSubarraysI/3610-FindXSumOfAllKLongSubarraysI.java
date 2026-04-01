// Last updated: 4/1/2026, 10:39:42 PM
class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) {
            int[] sub = Arrays.copyOfRange(nums, i, i + k);
            Map<Integer, Integer> freq = new HashMap<>();
            for (int num : sub) freq.put(num, freq.getOrDefault(num, 0) + 1);
            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
            list.sort((a, b) -> {
                if (!b.getValue().equals(a.getValue())) return b.getValue() - a.getValue();
                return b.getKey() - a.getKey();
            });
            Set<Integer> topX = new HashSet<>();
            for (int j = 0; j < Math.min(x, list.size()); j++) topX.add(list.get(j).getKey());
            int sum = 0;
            for (int num : sub) if (topX.contains(num)) sum += num;
            ans[i] = sum;
        }
        return ans;
    }
}
