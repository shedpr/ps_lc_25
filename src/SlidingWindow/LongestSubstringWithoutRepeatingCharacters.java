package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int low = 0, high = 0, len =0;
        Map<Character, Integer> charFreq = new HashMap<>();
        for (high = 0; high < s.length(); high++) {
            if (charFreq.containsKey(s.charAt(high))) {
                low = Math.max(low, charFreq.get(s.charAt(high)));
            }
                charFreq.put(s.charAt(high), high+1);
                len = Math.max(len, high - low + 1);

        }
        return len;
    }
}
