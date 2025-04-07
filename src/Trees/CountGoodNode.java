package Trees;

public class CountGoodNode {
    public int goodNodes(TreeNode root) {
        if(root == null)
            return 0;

        return countGoodNodes(root, root.val);
    }

    private int countGoodNodes(TreeNode root, int maxSoFar) {
        if(root == null)
            return 0;
        int left, right;

         left = countGoodNodes(root.left, Math.max(root.val, maxSoFar));
         right = countGoodNodes(root.right, Math.max(root.val, maxSoFar));

        if(root.val >= maxSoFar)
            return left + right + 1;

        else
            return left + right;
    }
}
