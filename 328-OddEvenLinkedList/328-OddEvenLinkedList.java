// Last updated: 4/1/2026, 10:44:16 PM
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode odd = head;  
        ListNode even = head.next;  
        ListNode evenHead = even;  
        while (even != null && even.next != null) {
            odd.next = even.next;  
            odd = odd.next;  
            
            even.next = odd.next;  
            even = even.next;  
        }
        
        odd.next = evenHead; 
        
        return head; 
    }
}
