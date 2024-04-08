package exercise;

import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private String filepath = "";

    public FileKV(String filepath, Map<String, String> initData) {
        this.filepath = filepath;

        for (var entry: initData.entrySet()) {
            this.set(entry.getKey(), entry.getValue());
        }
    }

    public void set(String key, String value) {
        var data = Utils.unserialize(Utils.readFile(this.filepath));
        data.put(key, value);
        Utils.writeFile(this.filepath, Utils.serialize(data));
    }

    public void unset(String key) {
        var data = Utils.unserialize(Utils.readFile(this.filepath));
        data.remove(key);
        Utils.writeFile(this.filepath, Utils.serialize(data));
    }

    public String get(String key, String def) {
        var data = Utils.unserialize(Utils.readFile(this.filepath));

        return data.getOrDefault(key, def);
    }

    public Map<String, String> toMap() {
        return Utils.unserialize(Utils.readFile(this.filepath));
    }
}
// END
