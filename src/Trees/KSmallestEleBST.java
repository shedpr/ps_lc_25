package Trees;

import java.util.ArrayList;
import java.util.List;

public class KSmallestEleBST {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> res = new ArrayList<>();
        findSmallest(root, res);
        return res.get(k-1);
    }

    void findSmallest(TreeNode node, List<Integer> ints) {
        if(node == null)
            return;
        findSmallest(node.left, ints);
        ints.add(node.val);
        findSmallest(node.right, ints);
    }
}
