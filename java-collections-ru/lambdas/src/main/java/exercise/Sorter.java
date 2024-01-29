package exercise;

import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.Objects;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> people) {
        return people.stream()
                .sorted((h1, h2) -> {
                    var d1 = LocalDate.parse(h1.get("birthday"));
                    var d2 = LocalDate.parse(h2.get("birthday"));

                    return d1.compareTo(d2);
                })
                .filter(h -> Objects.equals(h.get("gender"), "male"))
                .map(h -> h.get("name"))
                .toList();
    }
}
// END
