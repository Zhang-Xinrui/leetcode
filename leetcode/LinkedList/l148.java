class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode h = head;
        int len = 0;
        while(h != null) {h = h.next; len++;}
        ListNode left = head, right = head, temp;
        for(int i = 1; i < (len + 1) / 2; i++)
            right = right.next;
        temp = right.next; right.next = null;
        left = sortList(left); right = sortList(temp); //归并排序
        if(left.val > right.val) {
            temp = left; left = right; right = temp;
        }
        head = left;
        while(left != null && right != null) {
            while(left.next != null && left.next.val <= right.val) {
                left = left.next;
            }
            temp = left.next; left.next = right; left = left.next; right = temp;
        }
        return head;
    }
}