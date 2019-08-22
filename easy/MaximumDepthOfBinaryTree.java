
public class MaximumDepthOfBinaryTree {

    public int maxDepth(Node root) {
        if (root != null) {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
        return 0;
    }
}
