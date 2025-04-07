package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharReplacement {
    /**
     * "AABABBB"
     * map > A - 3 B - 2
     * low - 0
     * high - 3
     * k - 1
     * max + k <= high + 1
     * @param s
     * @param k
     * @return
     */
    public int characterReplacement(String s, int k) {
        int[] charFreq = new int[26];
        int maxCount = 0;
        int low = 0;
        int maxLen = 0;

        for (int high=0; high< s.length(); high++) {
            charFreq[s.charAt(high) - 'A']++;
            maxCount = Math.max(maxCount, charFreq[s.charAt(high) - 'A']);

            if (high - low + 1 - maxCount > k) {
                charFreq[s.charAt(high)-'A']--;
                low++;
            }

            maxLen = Math.max(maxCount, high - low + 1);
        }

        return maxLen;
    }
}
