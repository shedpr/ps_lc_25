public class BinarySearch {

    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int temp = nums[mid];
            if (temp == target) {
                return mid + 1;
            } else if (temp <= target) {
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        return -1;

        //        Deque<Integer> stack = new ArrayDeque<>();
//        int n = temperatures.length;
//        int retArr[] = new int[n];
//        /**
//         * Imp : use stack to hold index of all values < current
//         * If insert value in stack only if it is > current value
//         * [73,74,75,71,69,72,76,73]
//         * curr = 71
//         * stack = 2,3,4,5
//         * ret = 1,1,4,2,1,1,0,0
//         */
//        for (int i = 0; i < n; i++) {
//            int curr = temperatures[i];
//            while (!stack.isEmpty() && temperatures[stack.peek()] < curr) {
//                int low = stack.pop();
//                retArr[low] = i - low;
//            }
//            stack.push(i);
//        }
//        return retArr;
    }
}
