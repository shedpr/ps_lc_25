package Trees;


public class Traversal {
    void postOrder(TreeNode tn) {
        if (tn == null) {
            return;
        }
        postOrder(tn.left);
        postOrder(tn.right);
        System.out.print(tn.val);
    }

    void preOrder(TreeNode tn) {
        if (tn == null)
            return;

        System.out.print(tn.val);
        preOrder(tn.left);
        postOrder(tn.right);
    }

    void inOrder(TreeNode tn) {
        if (tn == null) {
            return;
        }

        inOrder(tn.left);
        System.out.print(tn.val);
        inOrder(tn.right);
    }
}
