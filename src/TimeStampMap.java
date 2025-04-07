import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeStampMap {
    HashMap<String, TreeMap<Integer, String>> mapStore;
    public TimeStampMap() {
        mapStore = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        mapStore.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if(mapStore.containsKey(key)) {
            TreeMap<Integer, String> temp = mapStore.get(key);
            Map.Entry<Integer, String> entry = temp.floorEntry(timestamp);
            return entry == null ? "" : entry.getValue();
        }
        return "";
    }
}
