package lesson31.func;

import java.util.function.Consumer;

public class Lambda5 {
    public static void main(String[] args) {
        Consumer<Integer> printer = x-> System.out.println(x + " рублей");
        printer.accept(700);

        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");
    }
}
