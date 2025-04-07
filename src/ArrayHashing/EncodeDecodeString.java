package ArrayHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeString {
    // Encodes a list of strings to a single string.

    /**
     * str = abc,abc,abc - abc|abc|abc
     * str = abc,|abc,|123,abc > abc|3abc|3ab|c|4
     * @param strs
     * @return
     */
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String s : strs) {
            encodedString.append(s.length()).append("/:").append(s);
        }
        return encodedString.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        /**
         * by adding delimiter in the beginning and never splitting the string while decoding,
         * we encounter and process only the occurrence of the character i.e. the delimiter
         * with the next value being size > we read the string as is and move on
         *
         */
        List<String> decodedString = new ArrayList<>();

        int i = 0;
        while (i<s.length()) {
            int delim = s.indexOf(":/", i);
            int size = Integer.parseInt(s.substring(i,delim));
            String str = s.substring(delim + 2, delim + size + 2);
            decodedString.add(str);
            i = delim + size + 2;
        }

        return decodedString;

    }
}
