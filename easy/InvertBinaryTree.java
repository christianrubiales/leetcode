

public class InvertBinaryTree {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            swap(root);
            invertTree(root.left);
            invertTree(root.right);
        }
        
        return root;
    }
    
    public void swap(TreeNode node) {
        TreeNode temp = node.left;
        node.left = node.right;
        node.right= temp;
    }
    
}
