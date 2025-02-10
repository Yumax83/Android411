package lesson31.func;

import java.util.function.BinaryOperator;

public class Lambda7 {
    public static void main(String[] args) {
        BinaryOperator<Integer> mul = (x, y) -> x * y;
        System.out.println(mul.apply(3,2));
        //DZ Predicat
    }
}
