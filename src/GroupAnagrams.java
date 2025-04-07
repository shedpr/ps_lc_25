import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> mapAnagrams = new HashMap<>();
        for(String s : strs) {
            char[] sChar = new char[26];
            // updating char array with count of char
            for(char c : s.toCharArray()) {
                sChar[c - 'a']++;
            }
            // converting into a string
            StringBuilder sb = new StringBuilder();
            for (char c : sChar) {
                sb.append(c).append('#');
            }
            // Adding to Hashmap
            if (mapAnagrams.containsKey(sb.toString())) {
                List<String> temp = mapAnagrams.get(sb.toString());
                temp.add(s);
                mapAnagrams.put(sb.toString(), temp);
            } else {
                mapAnagrams.put(sb.toString(), new ArrayList<>(List.of(s)));
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : mapAnagrams.entrySet()) {
            res.add(entry.getValue());
        }

        return res;
    }
}
