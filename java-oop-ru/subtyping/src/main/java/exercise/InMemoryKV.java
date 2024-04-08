package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> data = new HashMap<>();

    public InMemoryKV(Map<String, String> initData) {
        for (var entry: initData.entrySet()) {
            this.set(entry.getKey(), entry.getValue());
        }
    }

    public void set(String key, String value) {
        data.put(key, value);
    }

    public void unset(String key) {
        data.remove(key);
    }

    public String get(String key, String def) {
        return data.getOrDefault(key, def);
    }

    public Map<String, String> toMap() {
        return new HashMap<>(data);
    }
}
// END
