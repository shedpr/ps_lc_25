public class ClimbStairs {
    public int climbStairs(int n) {
        if(n == 0 || n==1)
            return n;


        int[]climbStairsArr = new int[n+1];

        climbStairsArr[1] = 1;
        climbStairsArr[2] = 2;

        for(int i=3; i<=n; i++) {
            climbStairsArr[i] = climbStairsArr[i-1] + climbStairsArr[i-2];
        }

        return climbStairsArr[n];

    }
}
