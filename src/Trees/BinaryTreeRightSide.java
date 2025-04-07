package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSide {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if(root == null)
            return res;
        // modeified level order
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int level = queue.size();
            boolean toggle = false;
            for(int i = 0; i< level; i++) {
                TreeNode temp = queue.poll();
                if (temp != null && !toggle) {
                    res.add(temp.val);
                    toggle = true;
                }
                if(temp.right != null)
                    queue.add(temp.right);
                if(temp.left!= null)
                    queue.add(temp.left);
            }
        }
        return res;
    }
}
