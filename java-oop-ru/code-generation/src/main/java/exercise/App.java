package exercise;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;

// BEGIN
public class App {
    public static void save(Path path, Car car) throws IOException {
        Files.write(path, car.serialize().getBytes());
    }

    public static Car extract(Path path) throws IOException {
        return Car.unserialize(Files.readString(path));
    }
}
// END
