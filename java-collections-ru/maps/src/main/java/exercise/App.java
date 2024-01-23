package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        var res = new HashMap<String, Integer>();

        if (sentence.isEmpty()) {
            return res;
        }

        var words = sentence.split(" ");
        for (var word: words) {
            var count = res.getOrDefault(word, 0);
            res.put(word, count + 1);
        }

        return res;
    }

    public static String toString(Map<String, Integer> data) {
        if (data.isEmpty()) {
            return "{}";
        }

        var str = new StringBuilder();

        str.append("{\n");

        for (Map.Entry<String, Integer> item: data.entrySet()) {
            str.append("  ")
                .append(item.getKey())
                .append(": ")
                .append(item.getValue())
                .append("\n");
        }

        str.append("}");

        return str.toString();
    }
}
//END
