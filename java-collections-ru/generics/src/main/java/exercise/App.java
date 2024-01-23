package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
public class App {
    public static <T> List<Map<T, T>> findWhere(List<Map<T, T>> books, Map<T, T> where) {
        var res = new ArrayList<Map<T, T>>();

        for (var book: books) {
            if (book.entrySet().containsAll(where.entrySet())) {
                res.add(book);
            }
        }

        return res;
    }
}
//END
