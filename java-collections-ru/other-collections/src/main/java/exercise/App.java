package exercise;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

// BEGIN
public class App {
    public static Map<String, String> genDiff(Map<String, Object> d1, Map<String, Object> d2) {
        var res = new HashMap<String, String>();
        var keys = new ArrayList<>(d1.keySet());

        for (var k: d2.keySet()) {
            if (!keys.contains(k)) {
                keys.add(k);
            }
        }

        for (var key: keys) {
            if (d1.containsKey(key) && d2.containsKey(key)) {
                if (d1.get(key).equals(d2.get(key))) {
                    res.put(key, "unchanged");
                } else {
                    res.put(key, "changed");
                }
            } else if (d1.containsKey(key)) {
                res.put(key, "deleted");
            } else {
                res.put(key, "added");
            }
        }

        return res;
    }
}
//END
