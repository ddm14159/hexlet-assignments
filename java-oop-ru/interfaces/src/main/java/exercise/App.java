package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, Integer n) {
        var result = new ArrayList<String>();
        homes.sort(Comparator.comparingDouble(Home::getArea));

        if (n > homes.size()) {
            n = homes.size();
        }

        List<Home> cut = homes.subList(0, n);

        for (var home: cut) {
            result.add(home.toString());
        }

        return result;
    }
}
// END
