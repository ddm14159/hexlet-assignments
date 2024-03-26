package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String str;
    public ReversedSequence(String str) {
        var reversed = new char[str.length()];

        for (var i = 0; i < str.length(); i++) {
            reversed[i] = str.toCharArray()[str.length() - 1 - i];
        }

        this.str = new String(reversed);
    }

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public char charAt(int index) {
        return str.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.str.substring(start, end);
    }
}
// END
