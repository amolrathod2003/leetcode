// Last updated: 4/1/2026, 10:41:23 PM
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
       Arrays.sort(target);
       Arrays.sort(arr);
       return Arrays.equals(target,arr);
        
    }
}