public class Solution { //A very smart solution
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while(a != b) {
            if(a == null) {
                a = headA;
            } else {
                a = a.next;
            }
            if(b == null) {
                b = headB;
            } else {
                b = b.next;
            }
        }
        return a;
    }
}

public class Solution { //常规方法
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        int lena = 0, lenb = 0;
        while(a != null) {a = a.next; lena++;}
        while(b != null) {b = b.next; lenb++;}
        a = headA; b = headB;
        while(lena > lenb) {
            a = a.next; lena--;
        }
        while(lena < lenb) {
            b = b.next; lenb--;
        }
        while(a != null && !a.equals(b)) {
            a = a.next; b = b.next;
        }
        return a;
    }
}