package ArrayHashing;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFreqElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> eleFreq = new HashMap<>();
        for(int i : nums) {
            eleFreq.put(i, eleFreq.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
                Comparator.comparingInt(eleFreq::get));

        for (Map.Entry<Integer, Integer> entry : eleFreq.entrySet()) {
            heap.offer(entry.getKey());
            if(heap.size() > k) {
                heap.poll();
            }
        }
        int[] res = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            res[i] = heap.poll();
        }
        return res;
    }
}
