class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode temp, head;
        if(l1.val <= l2.val) {
            temp = l1; l1 = l2; l2 = temp; //l1的值要大
        }
        head = l2;
        while(l1 != null && l2 != null) {
            while(l2.next != null && l2.next.val <= l1.val) l2 = l2.next;
            temp = l2.next; l2.next = l1; l2 = l1; l1 = temp;
        }        
        return head;
    }
}