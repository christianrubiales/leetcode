import java.util.LinkedList;

/**
 * Use preorder traversal and temporary linked list.
 */
public class FlattenBinaryTreeToLinkedList {

	private LinkedList<TreeNode> list = new LinkedList<>();

    public void flatten(TreeNode root) {
    	if (root != null) {
    		preOrder(root);
    		
    		if (!list.isEmpty()) {
		        TreeNode current = list.get(0);
		        root = current;
		        TreeNode next;
		        for (int i = 1; i < list.size(); i++) {
		        	next = list.get(i);
		        	current.right = next;
		        	current.left = null;
		        	current = next;
		        }
    		}
    	}
    }
	
    public void preOrder(TreeNode root) {
    	if (root != null) {
    		list.add(root);
    		preOrder(root.left);
    		preOrder(root.right);
    	}
    }
    
	public static void main(String[] args) {
		FlattenBinaryTreeToLinkedList flatten = new FlattenBinaryTreeToLinkedList();

		TreeNode root = new TreeNode(1);
		root.left = null;
		root.right = new TreeNode(2);
		flatten.flatten(root);
		
		// 1
//		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(5);
//		
//		TreeNode node = root.left;
//		node.left = new TreeNode(3);
//		node.right = new TreeNode(4);
//		
//		root.right.right = new TreeNode(6);
//	
//		flatten.flatten(root);
		
		// 2
//		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
//		
//		flatten.flatten(null);
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}