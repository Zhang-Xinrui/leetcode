class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newhead = new ListNode(0); newhead.next = head;
        ListNode left, first = newhead, second, right = head;
        while(right != null && right.next != null) {
            left = first; first = right; second = right.next; right = second.next;
            left.next = second; second.next = first; first.next = right;
        }
        return newhead.next;
    }
}