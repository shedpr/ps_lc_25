package Greedy;

public class JumpGame {
    /**
     * for loop goes from i -> maxJumpSoFar
     * when you exit out of loop if i != nums.length return false
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {

        if(nums.length ==0 || nums.length == 1)
            return true;
        int maxJumpSoFar = nums[0];

        for(int i=1; i <= maxJumpSoFar; i++) {
            maxJumpSoFar = Math.max(maxJumpSoFar, nums[i] + i);

            if (maxJumpSoFar >= nums.length - 1)
                return true;
        }

        return false;

    }
}
