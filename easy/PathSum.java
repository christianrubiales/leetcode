
public class PathSum {

    public boolean hasPathSum(Node root, int sum) {
        if (root == null) {
            return false;
        }
        
        if (root.left == null && root.right == null) { // leaf reached
            return root.val == sum;
        }
        
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
