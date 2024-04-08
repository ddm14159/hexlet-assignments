package exercise;

import java.util.Map;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage data) {
        if (data.toMap().isEmpty()) {
            return;
        }

        var result = new InMemoryKV(Map.of());
        var mappedData = data.toMap();

        for (Entry<String, String> entry: mappedData.entrySet()) {
            result.set(entry.getValue(), entry.getKey());
            data.unset(entry.getKey());
        }


        for (Entry<String, String> entry: result.toMap().entrySet()) {
            data.set(entry.getKey(), entry.getValue());
        }
    }
}
// END
