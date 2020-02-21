class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode newlist = head; int len = 0;
        while(newlist != null) {newlist = newlist.next; len++;}
        newlist = head;
        for(int i = 1; i < (len + 1) / 2; i++) newlist = newlist.next;
        ListNode lastone = newlist.next, newone = newlist.next.next, temp;
        lastone.next = null; newlist.next = null;
        while(newone != null) {
            temp = newone.next; newone.next = lastone;
            lastone = newone; newone = temp;
        }
        while(lastone != null) {
            temp = lastone.next; lastone.next = head.next; head.next = lastone;
            head = lastone.next; lastone = temp; 
        }
        return;
    }
}