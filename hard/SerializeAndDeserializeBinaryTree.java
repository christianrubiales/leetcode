import java.util.LinkedList;
import java.util.List;

public class SerializeAndDeserializeBinaryTree {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	
		TreeNode(int x) {
			val = x;
		}
	}
	
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
		if (root == null) {
			return "null";
		}
		
		List<TreeNode> list = new LinkedList<>();
		list.add(root);
		StringBuilder builder = new StringBuilder();
		
		while (!list.isEmpty()) {
			TreeNode node = list.remove(0);
			if (node == null) {
				builder.append("null,");
			} else {
				builder.append(node.val).append(',');
				list.add(node.left);
				list.add(node.right);
			}
		}

		String s = builder.toString();
		return s.substring(0, s.length() - 1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String serialized) {
		if (serialized.equals("null")) {
			return null;
		}

		List<TreeNode> list = new LinkedList<>();
		String[] array = serialized.split(",");
		TreeNode root = new TreeNode(Integer.parseInt(array[0]));
		list.add(root);
		
		for (int i = 1; i < array.length; i++) {
			TreeNode node = list.remove(0);

			if (!array[i].equals("null")) {
				node.left = new TreeNode(Integer.parseInt(array[i]));
				list.add(node.left);
			}

			if (!array[++i].equals("null")) {
				node.right = new TreeNode(Integer.parseInt(array[i]));
				list.add(node.right);
			}
		}
		
		return root;
    }
}
