//package LinkedL;
//
//public class FindDupsInArray {
//    /**
//     * rearrange array such that
//     * @param nums
//     * @return
//     */
//    public int findDuplicate(int[] nums) {
//        int swaps = 0;
//        int count = 0;
//
//        while (count < nums.length) {
//            if (nums[swaps] == swaps + 1) {
//                nums[swaps] = -1 * nums[swaps];
//                ++count;
//                ++swaps;
//            } else if (nums[swaps] == -1 * nums[swaps] + 1) {
//
//            } else {
//                int temp = nums[swaps];
//                int change = nums[temp - 1];
//                nums[swaps] = change;
//                nums[temp - 1] = temp;
//                swaps = change;
//                ++count;
//            }
//        }
//    }
//}
