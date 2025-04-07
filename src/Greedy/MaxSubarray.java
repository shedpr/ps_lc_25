package Greedy;

public class MaxSubarray {
    public int maxSubArray(int[] nums){
        // current index of res[] has either -
        // 1. only current index value
        // 2. current index + max till previous index
        int res[] = new int[nums.length];
        res[0] = nums[0];
        int maxSoFar = nums[0];
        for (int i=1; i<nums.length; i++) {
            res[i] = Math.max(res[i-1] + nums[i], nums[i]);

            if(res[i]>maxSoFar){
                maxSoFar=  res[i];
            }
        }

        return  maxSoFar;
    }

}
