package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, res, new ArrayList<>());

        return res;
    }
    private void backtrack(int[] nums, List<List<Integer>> res, List<Integer> temp) {
        if(temp.size() == nums.length)
            res.add(new ArrayList<>(temp));

        for(int num: nums) {
            if(!temp.contains(num)) {
                temp.add(num);
                backtrack(nums, res, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
