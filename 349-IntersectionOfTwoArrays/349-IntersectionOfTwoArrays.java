// Last updated: 4/1/2026, 10:44:12 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> SetA = new HashSet<>();
        for (int num : nums1) {
            SetA.add(num);
        }
        
        List<Integer> ans = new ArrayList<>();
        for (int num : nums2) {
            if (SetA.contains(num)) {
                ans.add(num);
                SetA.remove(num); 
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        
        return result;
    }
}