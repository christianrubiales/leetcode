
/**
 * Recursive version is simpler, less tricky.
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if (l1 == null) {
    		return l2;
    	}
    	if (l2 == null) {
    		return l1;
    	}
    	
    	if (l1.val < l2.val) {
    		l1.next = mergeTwoLists(l1.next, l2);
    		return l1;
    	} else {
    		l2.next = mergeTwoLists(l1, l2.next);
    		return l2;
    	}
    }
    
	public static void main(String[] args) {
		MergeTwoSortedLists merger = new MergeTwoSortedLists();
		
		ListNode node;
		
		node = merger.mergeTwoLists(null, new ListNode(0));
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
		System.out.println();
		
		node = merger.mergeTwoLists(new ListNode(0), null);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
		System.out.println();
		
		ListNode node1 = new ListNode(1);
		node1.next = new ListNode(2);
		
		ListNode node2 = new ListNode(3);
		node2.next = new ListNode(4);
		
		node = merger.mergeTwoLists(node1, node2);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
		System.out.println();

		ListNode node3 = new ListNode(1);
		node3.next = new ListNode(2);
		
		ListNode node4 = new ListNode(3);
		node4.next = new ListNode(4);
		
		node = merger.mergeTwoLists(node4, node3);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
		System.out.println();
		
		ListNode node5 = new ListNode(-10);
		node5.next = new ListNode(-10);
		node5.next.next = new ListNode(-9);
		node5.next.next.next = new ListNode(-4);
		node5.next.next.next.next = new ListNode(1);
		node5.next.next.next.next.next = new ListNode(6);
		node5.next.next.next.next.next.next = new ListNode(6);
		
		ListNode node6 = new ListNode(-7);
		node = merger.mergeTwoLists(node5, node6);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
		System.out.println();
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}