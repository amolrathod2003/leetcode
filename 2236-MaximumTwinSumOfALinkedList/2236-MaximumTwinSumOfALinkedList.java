// Last updated: 6/22/2026, 9:18:31 AM
class Solution {
    public int pairSum(ListNode head) {
        if (head == null) {
            return 0;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode cur = slow;
        while (cur != null) {
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        int maxTwinSum = 0;
        ListNode fHalf = head;
        ListNode sHalf = prev;
        while (sHalf != null) {
            int curSum = fHalf.val + sHalf.val;
            maxTwinSum = Math.max(maxTwinSum, curSum);
            fHalf = fHalf.next;
            sHalf = sHalf.next;
        }
        return maxTwinSum;
    }
}
