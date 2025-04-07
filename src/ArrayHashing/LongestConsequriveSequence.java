package ArrayHashing;

import java.util.HashMap;
import java.util.Map;

public class LongestConsequriveSequence {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> uniqueNum = new HashMap<>();
        for (int i : nums) {
            uniqueNum.put(i, false);
        }
        int longSeq = 0;
        for(Map.Entry<Integer, Boolean> entry : uniqueNum.entrySet()) {
            int currLongSeq = 0;
            int val = entry.getKey();
            while (uniqueNum.containsKey(val) && !uniqueNum.get(val)) {
                uniqueNum.put(val, true);
                --val;
                ++currLongSeq;
            }
            int val2 = entry.getKey() + 1;
            while (uniqueNum.containsKey(val2) && !uniqueNum.get(val2)) {
                uniqueNum.put(val2, true);
                ++val2;
                ++currLongSeq;
            }

            longSeq = Math.max(longSeq, currLongSeq);
        }

        return longSeq;
    }
}
