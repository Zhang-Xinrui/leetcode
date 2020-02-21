class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode temp = head, tail = null;
        int len = 0;
        while(temp != null) {tail = temp; temp = temp.next; len++;}
        k = k % len;
        if(k == 0) return head;
        ListNode first; temp = head;
        for(int i = 1; i < len - k; i++) {
            temp = temp.next;
        }
        first = temp.next; temp.next = null;tail.next = head;
        return first;
    }
}