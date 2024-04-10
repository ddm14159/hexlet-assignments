package exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// BEGIN
public class PairedTag extends Tag {
    private String name;
    private Map<String, String> values = new LinkedHashMap<>();
    private String body;
    private List<Tag> children = new ArrayList<>();

    public PairedTag(String name, Map<String, String> values, String body, List<Tag> children) {
        this.name = name;
        this.values.putAll(values);
        this.body = body;
        this.children.addAll(children);
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
        str.append(this.body);
        for (Tag child : children) {
            str.append(child.toString());
        }

        str.append("</").append(this.name).append(">");

        return str.toString();
    }
}
// END
