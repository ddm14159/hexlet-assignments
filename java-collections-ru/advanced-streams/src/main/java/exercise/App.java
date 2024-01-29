package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static String getForwardedVariables(String data) {
        var params = data.split("\n");

        var united = Arrays.stream(params)
                .filter(param -> param.startsWith("environment="))
                .map(param -> param.replace("environment=", "").replace("\"", ""))
                .collect(Collectors.joining(","));

        Stream<String> stream = Stream.of(united.trim().split(","));

        return stream
                .filter(item -> item.startsWith("X_FORWARDED_"))
                .map(item -> item.replace("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
