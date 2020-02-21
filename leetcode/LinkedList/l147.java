class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newhead = new ListNode(0); newhead.next = head;
        ListNode now, left, lastone = head;
        now = lastone.next;
        while(now != null) {
            if(now.val < lastone.val) {
                lastone.next = now.next;
                left = newhead; 
                while(left.next.val <= now.val) left = left.next;
                now.next = left.next; left.next = now;
                now = lastone.next;
            } else {
                lastone = now; now = now.next;
            }
        }
        return newhead.next;
    }
}