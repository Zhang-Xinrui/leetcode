class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newhead = new ListNode(val); newhead.next = head;
        ListNode lastone = newhead;
        while(head != null) {
            if(head.val == val) {
                lastone.next = head.next; head = head.next;
            } else {
                lastone = head; head = head.next;
            }
        }
        return newhead.next;
    }
}