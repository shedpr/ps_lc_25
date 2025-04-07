import java.util.Arrays;
import java.util.Comparator;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        /**
         * Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
         * speedArr = {10, 1}
         */
        double[][] speedArr = new double[2][position.length];
        for(int i =0; i<position.length; i++) {
            speedArr[i] = new double[]{position[i], (double) (target - position[i])/speed[i]};
        }
        Arrays.sort(speedArr, Comparator.comparingDouble(a -> a[0]));
        double cur = 0;
        int res = 0;
        for (int i = speedArr.length - 1; i >= 0 ; --i) {
            if (speedArr[i][1] > cur) {
                cur = speedArr[i][1];
                ++res;
            }
        }
        return res;

    }
}
