
/**
 * Determine the lengths, start comparing from length of the shorter. 
 * Reversing does not work because it modifies the structures.
 */
public class IntersectionOfTwoLinkedLists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA != null && headB != null) {
        	int l1 = length(headA);
        	int l2 = length(headB);
        	ListNode a = headA;
        	ListNode b = headB;
        	ListNode c = l1 > l2 ? a : b;
        	
        	// advance the pointer of the longer list
        	int diff = l1 > l2 ? l1 - l2 : l2 - l1;
    		for (int i = 0; i < diff; i++) {
    			c = c.next;
    		}
    		if (l1 > l2) {
    			a = c;
    		} else {
    			b = c;
    		}
        	
    		for (int i = 0; i < Math.max(l1, l2) - diff; i++) {
    			if (a.val == b.val) {
    				return a;
    			}
    			a = a.next;
    			b = b.next;
    		}
    		
        }
        
        return null;
    }
    
    public static int length(ListNode head) {
    	int i = 0;
    	
		ListNode n = head;
		while (n != null) {
			n = n.next;
			i++;
		}
    	
    	return i;
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
		headA.next = new ListNode(2);
		
//		headA = reverse(headA);
//		printList(headA);
//		System.out.println();
		
		ListNode headB = new ListNode(0);
		headB.next = new ListNode(-1);
		headB.next.next = new ListNode(2);
		
		ListNode intersection = getIntersectionNode(headA, headB);
		System.out.println(intersection != null ? intersection.val : null);
	}
}
