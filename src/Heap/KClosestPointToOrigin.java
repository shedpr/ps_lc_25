package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparing(a -> a[0]));

        for(int i = 0; i < points.length; i++) {
            int dist = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            queue.offer(new int[]{dist, points[i][0], points[i][1]});
        }
        int result[][] = new int[k][];

        for(int j = 0; j< k; j++) {
            int[] temp = queue.poll();
            result[j] = new int[]{temp[1], temp[2]};
        }

        return result;
    }
}
