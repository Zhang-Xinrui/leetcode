class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode lastone = head, temp, firstone = head.next;
        while(lastone.next.next != null) lastone = lastone.next;
        temp = lastone.next; lastone.next = null;
        temp.next = reverseList(head.next);
        firstone.next = head; head.next = null;
        return temp;
    }
}
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp1 = head.next, temp2;
        head.next = null;
        while(temp1 != null) {
            temp2 = temp1.next;
            temp1.next = head;
            head = temp1; temp1 = temp2;
        }
        return head;
    }
}