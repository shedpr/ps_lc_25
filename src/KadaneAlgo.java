public class KadaneAlgo {
    /**
     * Maximum Subarray Sum
     * @param arr
     */
    public void runAlgo(int[]arr) {
        int currMax = Integer.MIN_VALUE;
        int res = 0;
        for (int j : arr) {
            if (res < 0) {
                res = j;
            } else {
                res += j;
            }
            currMax = Math.max(currMax, res);
        }
        System.out.println(currMax);
    }
}
