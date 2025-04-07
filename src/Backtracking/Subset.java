package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<Integer>();
        backtrack(res, nums, 0, curr);
        return res;
    }

    private void backtrack(List<List<Integer>> res, int[] nums, int start, List<Integer> curr) {
        res.add(curr);

        for(int i = start; i<nums.length; i++) {
            curr.add(nums[i]);
            backtrack(res, nums, start+1, curr);
            curr.remove(curr.size() -1);
        }
    }
}
