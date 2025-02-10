package lesson31.func;

import java.util.function.UnaryOperator;

public class Lambda6 {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        UnaryOperator<String> uo = s-> s.toUpperCase();
        System.out.println(uo.apply("Java Code"));
    }
}
