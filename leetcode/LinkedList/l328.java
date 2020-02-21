class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
        ListNode slow = head, prefast, half = head.next, fast = head;
        while(fast.next != null && fast.next.next != null) {
            prefast = fast.next;
            fast = prefast.next;
            prefast.next = fast.next;
            slow.next = fast; slow = fast; 
        }
        slow.next = half;
        return head;
    }
}