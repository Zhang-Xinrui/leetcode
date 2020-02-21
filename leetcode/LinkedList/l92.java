class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == n) return head;
        ListNode left, right, leftmost, rightmost, temp, temp2, newhead = new ListNode(0);//哨兵
        newhead.next = head; left = newhead;
        for(int i = 1; i < m; i++) left = left.next;
        rightmost = leftmost = left.next; temp = rightmost.next;
        for(int i = 0; i < n - m; i++) {
            temp2 = temp.next; temp.next = rightmost;
            rightmost = temp; temp = temp2;
        }
        left.next = rightmost; leftmost.next = temp;
        return newhead.next;
    }
}