package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    /**
     * s1 = "ab", s2 = "eidboaoo"
     *
     */
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        Map<Character, Integer> strFreq = new HashMap<>();
        for (char c : s1.toCharArray()) {
            strFreq.put(c, strFreq.getOrDefault(c, 0) +1);
        }

        for (int i=0; i<s2.length(); ) {
            if (strFreq.containsKey(s2.charAt(i))) {
                Map<Character, Integer> temp = createTempFreq(s2, i, i + s1.length());
                if (matches(temp, strFreq)) {
                    return true;
                }
                i = i + s1.length();
            } else {
                i++;
            }
        }

        return false;
    }

    private boolean matches( Map<Character, Integer> temp, Map<Character, Integer> sPermute) {
        for (Map.Entry<Character, Integer> entry : temp.entrySet()) {
            if (sPermute.get(entry.getKey()) != entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> createTempFreq(String s2, int i, int len) {
        Map<Character, Integer> tempMap = new HashMap<>();
        for (int itr = i; itr < len; itr++) {
            tempMap.put(s2.charAt(itr), 1);
        }
        return tempMap;
    }
}
