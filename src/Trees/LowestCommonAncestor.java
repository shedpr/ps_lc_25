package Trees;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        /**
         * idea is, finding a node p & q are on different branches
         */
        while (root != null) {
            int paVal = root.val;

            if(p.val > paVal && q.val > paVal) {
                lowestCommonAncestor(root.right, p, q);
            }
            else if (p.val < paVal && q.val < paVal) {
                lowestCommonAncestor(root.left, p, q);
            }
            else
                return root;
        }
        return null;
    }
}
