
public class IntersectionOfTwoLinkedLists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA != null && headB != null) {
            ListNode a = reverse(headA);
            ListNode b = reverse(headB);
            ListNode prev = null;
            
            while (a != null && b != null && a.val == b.val) {
            	prev = a;
            	a = a.next;
            	b = b.next;
            }
            
            headA = reverse(a);
            headB = reverse(b);
            
            return prev;
        }
        
        return null;
    }
    
    public static ListNode reverse(ListNode head) {
    	ListNode curr = head;
    	ListNode prev = null;
    	ListNode next = null;
    	ListNode newHead = null;
    	
    	while (curr != null) {
    		next = curr.next;
    		curr.next = prev;
    		prev = curr;
    		if (next == null) {
    			newHead = curr;
    		}
    		curr = next;
    	}
    	
    	return newHead;
    }
    
    public static void printList(ListNode head) {
    	 ListNode a = head;
     
         while (a != null) {
         	System.out.println(a.val);
         	a = a.next;
         }
    }
    
    
	public static void main(String[] args) {
		ListNode headA = new ListNode(1);
		ListNode node2 = new ListNode(2);
		headA.next = new ListNode(2);
		
//		headA = reverse(headA);
//		printList(headA);
//		System.out.println();
		
		ListNode headB = new ListNode(0);
		headB.next = new ListNode(3);
		
		ListNode intersection = getIntersectionNode(headA, headB);
		System.out.println(intersection != null ? intersection.val : null);
	}
}
