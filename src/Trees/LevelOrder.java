package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null)
        queue.add(root);

        List<List<Integer>> resList = new ArrayList<>();

        while (!queue.isEmpty()) {
            int sizeQ = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < sizeQ; i++) {
                TreeNode temp = queue.poll();
                if(temp != null)
                    level.add(temp.val);
                if (temp != null && temp.left != null)
                    queue.add(temp.left);
                if(temp != null && temp.right !=null)
                    queue.add(temp.right);
            }
            resList.add(level);
        }
        return resList;
    }
}
