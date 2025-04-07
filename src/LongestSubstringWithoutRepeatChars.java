import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatChars {
    public int lengthOfLongestSubstring(String s) {
        // abcacbbb
        // a- 3 b - 1 c -2 --3

        // sliding window
        int i = 0, j = 0;
        int maxLen = 0;
        Map<Character, Integer> charCount = new HashMap<>();

        for (j = 0; j < s.length(); j++) {
            if (charCount.containsKey(s.charAt(j))) {
                i = Math.max(i, charCount.get(s.charAt(j)));
            } else {
                maxLen = Math.max(maxLen, j - i + 1);
                charCount.put(s.charAt(j), j + 1);
            }
        }
        return maxLen;
    }
}
