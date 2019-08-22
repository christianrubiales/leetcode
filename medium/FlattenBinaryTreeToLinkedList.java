import java.util.LinkedList;

/**
 * Use preorder traversal and temporary linked list.
 */
public class FlattenBinaryTreeToLinkedList {
	
	static class Node {
		int val;
		Node left;
		Node right;
	
		Node(int x) {
			val = x;
		}
	}

    public LinkedList<Node> flatten(Node root) {
    	LinkedList<Node> list = new LinkedList<>();
    	if (root != null) {
    		preOrder(root, list);
    		
    		if (!list.isEmpty()) {
		        Node current = list.get(0);
		        root = current;
		        Node next;
		        for (int i = 1; i < list.size(); i++) {
		        	next = list.get(i);
		        	current.right = next;
		        	current.left = null;
		        	current = next;
		        }
    		}
    	}
    	
    	return list;
    }
	
    public void preOrder(Node root, LinkedList<Node> list) {
    	if (root != null) {
    		list.add(root);
    		preOrder(root.left, list);
    		preOrder(root.right, list);
    	}
    }
    
    private static void print(LinkedList<Node> list) {
    	for (Node node : list) {
    		System.out.print(node.val + ", ");
    	}
    	System.out.println();
    }
    
	public static void main(String[] args) {
		FlattenBinaryTreeToLinkedList flatten = new FlattenBinaryTreeToLinkedList();

//		Node root = new Node(1);
//		root.left = null;
//		root.right = new Node(2);
//		print(flatten.flatten(root));
		
		// 1
//		Node root = new Node(1);
//		root.left = new Node(2);
//		root.right = new Node(5);
//		
//		Node node = root.left;
//		node.left = new Node(3);
//		node.right = new Node(4);
//		
//		root.right.right = new Node(6);
//	
//		print(flatten.flatten(root));
		
		// 2
//		Node root = new Node(1);
//		root.left = new Node(2);
//		
//		print(flatten.flatten(null));
	}

}
