package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    private String name;
    private Map<String, String> values = new HashMap<>();

    public SingleTag(String name, Map<String, String> values) {
        this.name = name;
        this.values.putAll(values);
    }

    public String toString() {
        var str = new StringBuilder();

        str.append("<").append(this.name);

        for (var entry: values.entrySet()) {
            str.append(" ")
                    .append(entry.getKey())
                    .append("=")
                    .append("\"")
                    .append(entry.getValue())
                    .append("\"");
        }

        str.append(">");

        return str.toString();
    }
}
// END
