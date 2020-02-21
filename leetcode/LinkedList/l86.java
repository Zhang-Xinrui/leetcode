class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode newhead = new ListNode(0); newhead.next = head;
        ListNode left = newhead, temp;
        while(left.next != null && left.next.val < x) left = left.next;//插到left后面
        if(left.next == null) return head;
        head = left.next;
        while(head.next != null) {
            if(head.next.val < x) {
                temp = head.next; head.next = temp.next;
                temp.next = left.next; left.next = temp; left = temp;
            } else {
                head = head.next;
            }
        }
        return newhead.next;
    }
}