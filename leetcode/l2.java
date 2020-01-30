public class l2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int count = 0;
        int sum;
        ListNode lsum = null, oldnode = null;
        while(l1 != null || l2 != null) {
            sum = count; count = 0;
            if(l1 != null) {
                sum += l1.val; l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val; l2 = l2.next;
            }
            if(sum > 9) {
                sum = sum - 10; count = 1;
            }
            ListNode newnode = new ListNode(sum);
            if(oldnode == null) {
                lsum = newnode; oldnode = newnode;
            } else {
                oldnode.next = newnode; oldnode = newnode;
            }
        }
        if(count == 1) {
            oldnode.next = new ListNode(1);
        }
        return lsum;
    }
}
