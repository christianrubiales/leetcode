
public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        
        ListNode curr = head;
        
        while (curr != null && curr.val == val) {
            curr = curr.next;
        }
        head = curr;
        if (head == null) {
            return head;
        }
        
        ListNode prev = null;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
                curr = curr.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
