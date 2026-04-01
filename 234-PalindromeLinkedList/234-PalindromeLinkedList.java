// Last updated: 4/1/2026, 10:44:33 PM
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode present = head;
        ListNode next = null;
        while (present != null) {
            next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }
        return prev;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode mid = middleNode(head);
        ListNode headSec = reverseList(mid);
        ListNode reverseHead = headSec;
        ListNode first = head;
        boolean result = true;
        while (headSec != null) {
            if (first.val != headSec.val) {
                result = false;
                break;
            }
            first = first.next;
            headSec = headSec.next;
        }
        reverseList(reverseHead);
        return result;
    }
}
