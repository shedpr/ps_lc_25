import java.util.HashMap;
import java.util.Map;

public class MaxSumDistinctSubarraysWithLengthK {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> countDistinct = new HashMap<>();
        for (int i = 0; i < k; i++) {
            countDistinct.put(nums[i], countDistinct.getOrDefault(nums[i], 0) + 1);
        }
        int distinctSize = countDistinct.size();
        for (int i = k; i < nums.length; i++) {
            countDistinct.put(nums[i], countDistinct.getOrDefault(nums[i], 0) + 1);
            countDistinct.put(nums[i-k], countDistinct.get(nums[i - k] -1));
            if (countDistinct.get(nums[i - k]) == 0) {
                countDistinct.remove(nums[i - k]);
            }

            distinctSize += countDistinct.size();
        }
        return distinctSize;
    }
}
