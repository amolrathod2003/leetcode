// Last updated: 6/14/2026, 12:42:31 PM
1class Solution {
2    public int pairSum(ListNode head) {
3        if (head == null) {
4            return 0;
5        }
6        ListNode slow = head;
7        ListNode fast = head;
8        while (fast != null && fast.next != null) {
9            slow = slow.next;
10            fast = fast.next.next;
11        }
12        ListNode prev = null;
13        ListNode cur = slow;
14        while (cur != null) {
15            ListNode nextNode = cur.next;
16            cur.next = prev;
17            prev = cur;
18            cur = nextNode;
19        }
20        int maxTwinSum = 0;
21        ListNode fHalf = head;
22        ListNode sHalf = prev;
23        while (sHalf != null) {
24            int curSum = fHalf.val + sHalf.val;
25            maxTwinSum = Math.max(maxTwinSum, curSum);
26            fHalf = fHalf.next;
27            sHalf = sHalf.next;
28        }
29        return maxTwinSum;
30    }
31}
32