// Last updated: 4/1/2026, 10:39:46 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=dummy;
        while(cur.next!=null){
            if(set.contains(cur.next.val)){
                cur.next=cur.next.next;
            }else{
                cur=cur.next;

            }
        }
        return dummy.next;

        
    }
}