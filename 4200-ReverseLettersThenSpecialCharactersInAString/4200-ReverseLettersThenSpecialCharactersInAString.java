// Last updated: 4/1/2026, 10:39:11 PM
class Solution {
    public String reverseByType(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int l = 0, r = n - 1;

        while (l < r) {
            if (!Character.isLowerCase(arr[l])) {
                l++;
            } 
            else if (!Character.isLowerCase(arr[r])) {
                r--;
            } 
            else {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }

        l = 0;
        r = n - 1;

        while (l < r) {
            if (Character.isLowerCase(arr[l])) {
                l++;
            } 
            else if (Character.isLowerCase(arr[r])) {
                r--;
            } 
            else {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }

        return new String(arr);
    }
}
