package exercise;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] data) {
        var res = new String[data.length * 2][data[0].length * 2];
        for (var i = 0; i < data.length; i++) {
            for (var j = 0; j < data[0].length; j++) {
                res[i * 2][j * 2] = data[i][j];
                res[i * 2 + 1][j * 2] = data[i][j];
                res[i * 2][j * 2 + 1] = data[i][j];
                res[i * 2 + 1][j * 2 + 1] = data[i][j];
            }
        }

        return res;
    }
}
// END
