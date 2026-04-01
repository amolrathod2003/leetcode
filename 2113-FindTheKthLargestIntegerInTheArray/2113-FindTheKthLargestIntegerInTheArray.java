// Last updated: 4/1/2026, 10:40:40 PM
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums,new Comparator<String>() {
            public int compare(String a,String b) {
                if(a.length() !=b.length()){
                    return Integer.compare(b.length(), a.length());
                }
                else{
                    return b.compareTo(a);
                }
            }
        });
        return nums[k-1];

        
    }
}