package Trees;

import com.google.common.base.Strings;
import org.apache.commons.lang.StringUtils;

import java.util.LinkedList;
import java.util.Queue;

public class CreateATreeFromList {
    public TreeNode createTreeFromList(String[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode ret = new TreeNode(Integer.parseInt(arr[0]));
        queue.add(ret);
        int itr = 1;
        while (itr + 1 <= arr.length && !queue.isEmpty()) {
            TreeNode tn = queue.poll();
            TreeNode left;
            TreeNode right;

            if (!Strings.isNullOrEmpty(arr[itr])) {
                left = new TreeNode(Integer.parseInt(arr[itr]));
                queue.add(left);
            } else {
                left = new TreeNode();
            }
            tn.left = left;
            itr++;
            if (itr >= arr.length) {
                break;
            }
            if (!Strings.isNullOrEmpty(arr[itr])) {
                right = new TreeNode(Integer.parseInt(arr[itr]));
                queue.add(right);
            } else {
                right = new TreeNode();
            }
            tn.right = right;
            itr++;
        }

        return ret;

    }

    public void displayList(TreeNode tn) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tn);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.val + "\t");

            if(temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

}
