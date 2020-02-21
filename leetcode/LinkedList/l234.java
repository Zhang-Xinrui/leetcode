class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        if(head.next.next == null) return head.val == head.next.val;
        //把list反过来
        ListNode now = head; int len = 0;
        while(now != null) {now = now.next; len++;}
        now = head;
        for(int i = 1; i < (len + 1) / 2; i++) now = now.next;
        ListNode lastone = now.next, thisone = now.next.next, temp;
        lastone.next = null;
        while(thisone != null) {
            temp = thisone.next; thisone.next = lastone;
            lastone = thisone; thisone = temp;
        }
        temp = head;
        while(lastone != null) {
            if(lastone.val != temp.val) return false;
            else {lastone = lastone.next; temp = temp.next;}
        }
        return true;
    }
}