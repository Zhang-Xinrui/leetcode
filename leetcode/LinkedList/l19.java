class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        ListNode left = newhead, right = head;
        for(int i = 0; i < n; i++)
            head = head.next;
        while(head != null) {left = left.next; right = right.next; head = head.next;}
        left.next = right.next;
        return newhead.next;
    }
}