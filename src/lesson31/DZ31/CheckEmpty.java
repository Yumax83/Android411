package lesson31.DZ31;

import java.util.function.Predicate;

public class CheckEmpty {
    public static void main(String[] args) {
        Predicate<String> checkingEmpty = str -> str.trim().isEmpty(); //проверка пустой строки с удалением пробелов

        String stroka1 = "     ";
        String stroka2 = "Строка содержит текст!";

        System.out.println("Строка 1: " + stroka1 + "\nСтрока 1 пустая: " + checkingEmpty.test(stroka1));
        System.out.println("\nСтрока 2: " + stroka2 + "\nСтрока содержит текст: " + checkingEmpty.test(stroka2));

    }
}
