package Heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class KLargestElement {
    public int findKthLargest(int[] nums, int k) {
         int[] res = new int[2];
        if (nums.length == 0 || nums.length < k)
            return 0;

        Queue<Integer> queue = new PriorityQueue<>();
        for (int n : nums) {
                queue.offer(n);

                if (queue.size() > k) {
                    queue.poll();
                }
            }

        return queue.peek();
    }
}