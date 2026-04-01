// Last updated: 4/1/2026, 10:43:40 PM
class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, arr.length - 1);
            reverse(arr, start, end);
        }
        return new String(arr);
    }
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
