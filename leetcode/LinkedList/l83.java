class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode lastone = head, newone = head.next;
        while(newone != null) {
            if(newone.val == lastone.val) newone = newone.next;
            else {lastone.next = newone; lastone = newone; newone = newone.next;}
        }
        lastone.next = null;
        return head;
    }
}