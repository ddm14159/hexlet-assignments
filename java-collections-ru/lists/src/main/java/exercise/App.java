package exercise;

import java.util.HashMap;

// BEGIN
class App {
    public static boolean scrabble(String mixed, String plain) {
        if (mixed.isEmpty()) {
            return false;
        }

        if (plain.isEmpty()) {
            return true;
        }

        var lowedMixed = mixed.toLowerCase();
        var lowedPlain = plain.toLowerCase();
        var source = new HashMap<Character, Integer>();

        for (var ch: lowedMixed.toCharArray()) {
            var count = source.getOrDefault(ch, 0);
            source.put(ch, count + 1);
        }

        for (var ch: lowedPlain.toCharArray()) {
            var count = source.get(ch);

            if (count == 0) {
                return false;
            }

            source.put(ch, count - 1);
        }

        return true;
    }
}
//END
