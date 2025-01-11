package lesson26.enums;

import java.util.regex.Pattern;

enum RegEx {
    UPPER("[A-z]+"),
    LOWER("[a-z]+"),
    NUMERIC("[+-]?[0-9]+");

    private final Pattern pattern;

    RegEx(String pattern) {
        this.pattern = Pattern.compile(pattern);
    }

    public boolean test(final String input) {
        return pattern.matcher(input).matches();
    }

}

public class Base {
    public static void main(String[] args) {
        System.out.println(RegEx.UPPER.test("ABC"));
        System.out.println(RegEx.LOWER.test("dsd"));
        System.out.println(RegEx.NUMERIC.test("233"));

    }
}
