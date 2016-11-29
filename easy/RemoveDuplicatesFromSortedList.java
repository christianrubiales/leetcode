
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null) {
            if (current.next != null) {
                // duplicate found, point to next in list
                if (current.val == current.next.val) {
                    current.next = current.next.next;
                } else { // not a duplicate, increment current
                    current = current.next;
                }
            } else {
                // no more next
                break;
            }
        }
        
        return head;
    }
}
