class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newhead = new ListNode(0), lastone; newhead.next = head;
        lastone = newhead;
        while(head != null && head.next != null) {
            if(head.val == head.next.val) {
                while(head.next != null && head.val == head.next.val) head = head.next;
                lastone.next = head.next; head = head.next;
            } else {
                lastone = head; head = head.next;
            }
        }
        return newhead.next;
    }
}