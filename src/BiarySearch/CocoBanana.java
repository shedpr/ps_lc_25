package BiarySearch;

public class CocoBanana {
    public int minEatingSpeed(int[] piles, int h) {
        /**
         * brute force : sample all speeds from 1 -> max in piles[], find the lowest satisfying condition
         * improve : solution is 1 > n (sorted), find value that satisfies and keep binary search to left (find lowest)
         */


        int min = 1;
        int max = 1;

        for (int i : piles) {
            max = Math.max(max, i);
        }

        int res = max;

        while (min < max) {
            int timeTaken = 0;

            int mid = (min + max)/2;

            for (int p : piles) {
                timeTaken += Math.ceil((double) p/mid);
            }

            if(timeTaken > h) {
                min = mid + 1;
            }
            else {
                max = mid;
            }
        }

        return max;
    }
}
